package com.kodulersfittasa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import com.kodulersfittasa.databinding.Onboarding1Binding

class Onboarding1() : AppCompatActivity(), Parcelable {
    private lateinit var binding: Onboarding1Binding

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Onboarding1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        doLogin()

    }

    private fun doLogin() {
        binding.buttonNext.setOnClickListener{
            startActivity(Intent(this,onboarding2::class.java))
        }
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Onboarding1> {
        override fun createFromParcel(parcel: Parcel): Onboarding1 {
            return Onboarding1(parcel)
        }

        override fun newArray(size: Int): Array<Onboarding1?> {
            return arrayOfNulls(size)
        }
    }
}
