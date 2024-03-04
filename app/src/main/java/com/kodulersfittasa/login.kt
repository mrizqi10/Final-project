package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kodulersfittasa.databinding.ActivityHomeBinding
import com.kodulersfittasa.databinding.ActivityLoginBinding
import com.kodulersfittasa.databinding.ActivitySignUpBinding

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        doLogin()
    }


    private fun doLogin() {
        binding.login.setOnClickListener {

            val email = binding.email.text.toString().trim()
            val password = binding.txtbxPassword.text.toString().trim()

            if (email.isEmpty()) {
                binding.email.error = "Email tidak boleh kosong"
                binding.email.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.txtbxPassword.error = "Password tidak boleh kosong"
                binding.txtbxPassword.requestFocus()
                return@setOnClickListener
            }

            // Proses login disini
            // Anda perlu menambahkan logika autentikasi pengguna di sini
            // Misalnya, Anda perlu mengecek apakah email dan password cocok dengan data pengguna yang ada
            // Jika autentikasi berhasil, lanjutkan ke aktivitas home
            // Jika autentikasi gagal, tampilkan pesan error

            // Contoh logika autentikasi sederhana
            if (email == "contoh@email.com" && password == "contohpassword") {
                startActivity(Intent(this, home::class.java))
                Toast.makeText(this, "Anda Berhasil Login", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Email atau password salah", Toast.LENGTH_LONG).show()
            }
        }
    }
}