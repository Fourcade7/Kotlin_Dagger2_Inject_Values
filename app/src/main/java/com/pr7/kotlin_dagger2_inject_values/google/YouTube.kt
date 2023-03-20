package com.pr7.kotlin_dagger2_inject_values

import android.util.Log
import com.pr7.kotlin_dagger2_inject_values.Constants.TAG


class YouTube{
    init {
        Log.d(TAG, "Youtube class has invoked: ")
    }

    //method injection automatically called fun

    fun videoplaying(){
        Log.d(TAG, "videoplaying video is playing...: ")
    }
}