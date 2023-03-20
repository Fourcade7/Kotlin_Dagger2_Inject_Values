package com.pr7.kotlin_dagger2_inject_values.dagger


import com.pr7.kotlin_dagger2_inject_values.MainActivity
import dagger.Component


@Component(modules = [FirebaseModule::class])
interface GoogleComponent {

    fun inject(mainActivity: MainActivity)



}