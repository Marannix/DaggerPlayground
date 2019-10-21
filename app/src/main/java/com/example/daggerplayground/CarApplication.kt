package com.example.daggerplayground

import android.app.Application

class CarApplication : Application() {

    lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
        initComponent().inject(this)
    }

    private fun initComponent() : CarComponent {
       if (!this::carComponent.isInitialized) {
           carComponent = createComponent()
       }
        return carComponent
    }

    private fun createComponent() : CarComponent {
        return DaggerCarComponent.builder().application(this).build()
    }
}