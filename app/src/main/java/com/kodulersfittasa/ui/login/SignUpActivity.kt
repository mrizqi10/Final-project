package com.kodulersfittasa.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.kodulersfittasa.R
import com.kodulersfittasa.databinding.ActivitySignUpBinding
import com.kodulersfittasa.home
import com.kodulersfittasa.login

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var databaseReference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        auth = Firebase.auth

        binding.buttonSignup.setOnClickListener {
            val etName = binding.username
            val etEmail = binding.username
            val etPassword = binding.username
            val etConfirmPassword = binding.username

            val userName = etName.text.toString()
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()
            val confirmPassword = etConfirmPassword.text.toString()

            if (TextUtils.isEmpty(userName)){
                Toast.makeText(applicationContext,"username is required",Toast.LENGTH_SHORT).show()
            }
            if (TextUtils.isEmpty(email)){
                Toast.makeText(applicationContext,"email is required",Toast.LENGTH_SHORT).show()
            }

            if (TextUtils.isEmpty(password)){
                Toast.makeText(applicationContext,"password is required",Toast.LENGTH_SHORT).show()
            }

            if (TextUtils.isEmpty(confirmPassword)){
                Toast.makeText(applicationContext,"confirm password is required",Toast.LENGTH_SHORT).show()
            }

            if (password != confirmPassword){
                Toast.makeText(applicationContext,"password not match",Toast.LENGTH_SHORT).show()
            }
            registerUser(userName,email,password)

        }

        binding.buttonLogin.setOnClickListener {
            val intent = Intent(this@SignUpActivity,
                login::class.java)
            startActivity(intent)
            finish()
        }

    }

    // fun = function yang berarti "perintah" dalam bahasa pemrograman
    // membuat function registerUser
    private fun registerUser(userName: String, email: String, password: String){
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){ it ->
                if (it.isSuccessful){
                    val user: FirebaseUser? = auth.currentUser
                    val userId:String = user!!.uid
                    val etName = binding.username
                    val etEmail = binding.email
                    val etPassword = binding.txtbxPassword
                    val etConfirmPassword = binding.txtbxConfirmPassword
                    databaseReference = FirebaseDatabase.getInstance().getReference("Users").child(userId)

                    val hashMap:HashMap<String,String> = HashMap()
                    hashMap["userId"] = userId
                    hashMap["userName"] = userName
                    hashMap["profileImage"] = ""

                    databaseReference.setValue(hashMap).addOnCompleteListener(this){
                        if (it.isSuccessful){
                            //open home activity
                            etName.setText("")
                            etEmail.setText("")
                            etPassword.setText("")
                            etConfirmPassword.setText("")

                            val intent = Intent(this@SignUpActivity,
                                home::class.java)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
            }
    }
}