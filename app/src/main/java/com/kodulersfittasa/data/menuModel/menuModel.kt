package com.kodulersfittasa.data.menuModel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MenuModel(

    var thumbnail : Int = 0,
    var judul : String = "",
    var kalori : String = "",
    var lemak : String = "",
    var karbo : String = "",
    var protein : String = "",
) : Parcelable
