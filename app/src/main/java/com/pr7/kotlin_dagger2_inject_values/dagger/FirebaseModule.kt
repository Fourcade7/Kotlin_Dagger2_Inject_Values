package com.pr7.kotlin_dagger2_inject_values.dagger

import com.pr7.kotlin_dagger2_inject_values.Firebase
import dagger.Module
import dagger.Provides


@Module
class FirebaseModule constructor(
    val progresscount:Int
) {

    @Provides
    fun provideFirebase():Firebase{
        return Firebase(progresscount)
    }

}