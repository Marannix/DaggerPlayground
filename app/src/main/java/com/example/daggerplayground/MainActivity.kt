package com.example.daggerplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var car: Car
//    private lateinit var carComponent: ApplicationComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerCarComponent.create().inject(this)
//        carComponent = DaggerCarComponent.create()
//        carComponent.inject(this)
        car.drive()
    }
}
