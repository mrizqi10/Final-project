package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.kodulersfittasa.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setSupportActionBar(binding.toolbar)
    }
    fun onMenuClicked(view: View) {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }
}