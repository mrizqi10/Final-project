package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodulersfittasa.databinding.Onboarding2Binding
import com.kodulersfittasa.databinding.Onboarding3Binding

class onboarding3 : AppCompatActivity() {

    private lateinit var binding: Onboarding3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Onboarding3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button3.setOnClickListener{
            startActivity(Intent(this, before_register::class.java))
        }

    }
}