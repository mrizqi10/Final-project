package com.kodulersfittasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodulersfittasa.databinding.ActivityDetailMakananBinding
import com.kodulersfittasa.databinding.ActivitySignUpBinding

class detail_makanan : AppCompatActivity() {

    private lateinit var binding: ActivityDetailMakananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)
        binding = ActivityDetailMakananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCook.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("fat", 65)
            intent.putExtra("carbs", 84)
            intent.putExtra("calories", 190)
            intent.putExtra("protein", 87)
            startActivity(intent)


        }
    }
}