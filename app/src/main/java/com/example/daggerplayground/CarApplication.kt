package com.example.daggerplayground

import android.app.Activity
import android.app.Application
import com.example.daggerplayground.dagger.components.ApplicationComponent
import com.example.daggerplayground.dagger.components.DaggerApplicationComponent
import javax.inject.Inject
import dagger.android.*

class CarApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    lateinit var carComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        initComponent().inject(this)
    }

    private fun initComponent() : ApplicationComponent {
       if (!this::carComponent.isInitialized) {
           carComponent = createComponent()
       }
        return carComponent
    }

    private fun createComponent() : ApplicationComponent {
        return DaggerApplicationComponent.builder().application(this).build()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return  dispatchingAndroidInjector
    }

}