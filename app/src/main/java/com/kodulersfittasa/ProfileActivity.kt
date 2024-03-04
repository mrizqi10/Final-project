package com.kodulersfittasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)
        val fat = intent.getFloatExtra("fat", 0f)
        val carbs = intent.getFloatExtra("carbs", 0f)
        val calories = intent.getFloatExtra("calories", 0f)
        val protein = intent.getFloatExtra("protein", 0f)

// Now you can use these values in your ProfileActivity
    }
}