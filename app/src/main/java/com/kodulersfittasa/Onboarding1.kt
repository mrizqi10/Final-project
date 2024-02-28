package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodulersfittasa.databinding.Onboarding1Binding

class Onboarding1 : AppCompatActivity() {

    private lateinit var binding: Onboarding1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Onboarding1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.setOnClickListener{
            startActivity(Intent(this, onboarding2::class.java))
        }

    }
}