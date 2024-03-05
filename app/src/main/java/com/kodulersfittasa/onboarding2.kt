package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodulersfittasa.databinding.Onboarding2Binding

class onboarding2 : AppCompatActivity() {
    private lateinit var binding: Onboarding2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Onboarding2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        doLogin()

    }

    private fun doLogin() {
        binding.buttonNext.setOnClickListener {
            startActivity(Intent(this, onboarding3::class.java))
        }
    }
}