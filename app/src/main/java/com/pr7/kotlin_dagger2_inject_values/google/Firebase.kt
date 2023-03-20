package com.pr7.kotlin_dagger2_inject_values


import android.util.Log
import com.pr7.kotlin_dagger2_inject_values.Constants.TAG
import javax.inject.Inject


class Firebase constructor(
     val progresscount:Int
) {
    init {
        Log.d(TAG, "Firebase Class has invoked: ")
    }

    fun realtimeDatabase(){
        Log.d(TAG, "realtimeDatabase: is running")
    }
    
    fun printinfo(){
        Log.d(TAG, "printinfo: $progresscount")
    }

}