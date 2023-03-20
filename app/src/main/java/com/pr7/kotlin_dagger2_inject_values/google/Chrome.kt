package com.pr7.kotlin_dagger2_inject_values


import android.util.Log
import com.pr7.kotlin_dagger2_inject_values.Constants.TAG


class Chrome constructor(
    val firebase: Firebase,
    val youTube: YouTube
) {
    init {
        Log.d(TAG, "Chrome Class has invoked: ")

    }

    fun chromebrowser(){
        Log.d(TAG, "chromebrowser: is running...")
    }
}