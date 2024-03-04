package com.kodulersfittasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.kodulersfittasa.databinding.Onboarding1Binding

class Onboarding1 : AppCompatActivity() {
    private var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding1)

    }

    private fun loadFragment(fragment: OnboardingFragment1) {
        if (currentFragment != null) {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left)
                .replace(R.id.fragment_container, fragment)
                .commit()
        } else {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
        currentFragment = fragment
    }

    fun nextFragment(nextFragment: Fragment?) {
        if (nextFragment != null) {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.slide_out_left, R.anim.slide_in_right)
                .replace(R.id.fragment_container, nextFragment)
                .commit()
        }
        currentFragment = nextFragment

    }

}


