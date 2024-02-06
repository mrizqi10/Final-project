package com.kodulersfittasa

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class OnboardingActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

        viewPager = findViewById(R.id.onboarding_viewpager)

        // Set up the ViewPager2 adapter
        val adapter = OnboardingViewPagerAdapter(this)
        viewPager.adapter = adapter

        // Add a page change listener to handle screen transitions
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == adapter.itemCount - 1) {
                    // This is the last screen; show a button to proceed to the main app content
                    findViewById<Button>(R.id.onboarding_viewpager).visibility = View.VISIBLE
                } else {
                    findViewById<Button>(R.id.onboarding_viewpager).visibility = View.GONE
                }
            }
        })
    }
}