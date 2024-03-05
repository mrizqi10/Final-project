package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodulersfittasa.databinding.ActivityBeforeRegisterBinding
import com.kodulersfittasa.ui.login.SignUpActivity

class before_register : AppCompatActivity() {

    private lateinit var binding: ActivityBeforeRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeforeRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonLogin.setOnClickListener{
            startActivity(Intent(this, login::class.java))
        }

        binding.buttonSignIn.setOnClickListener{
            startActivity(Intent(this, SignUpActivity::class.java))
        }

    }
}