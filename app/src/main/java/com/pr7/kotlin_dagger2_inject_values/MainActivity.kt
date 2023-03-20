package com.pr7.kotlin_dagger2_inject_values

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pr7.kotlin_dagger2_inject_values.dagger.DaggerGoogleComponent
import com.pr7.kotlin_dagger2_inject_values.dagger.FirebaseModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var firebase: Firebase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val googleComponent= DaggerGoogleComponent
//            .builder()
//            .firebaseModule(FirebaseModule(100))
//            .build()
//        googleComponent.inject(this@MainActivity)

        firebase.printinfo()
    }
}