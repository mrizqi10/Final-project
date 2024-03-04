package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detail_makanan : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)

        val intent = Intent(this, ProfileActivity::class.java)

        intent.putExtra("fat", 65)
        intent.putExtra("carbs", 84)
        intent.putExtra("calories", 190)
        intent.putExtra("protein", 87)
        startActivity(intent)


    }
}