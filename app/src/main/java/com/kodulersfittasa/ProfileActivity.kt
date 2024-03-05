package com.kodulersfittasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)
        intent.getFloatExtra("fat", 0f)
        intent.getFloatExtra("carbs", 0f)
        intent.getFloatExtra("calories", 0f)
        intent.getFloatExtra("protein", 0f)

// Now you can use these values in your ProfileActivity
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }

        return super.onOptionsItemSelected(item)
    }
}