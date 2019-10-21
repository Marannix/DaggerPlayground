package com.example.daggerplayground.dagger.components

import android.app.Application
import com.example.daggerplayground.CarApplication
import com.example.daggerplayground.dagger.modules.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

// The Injector
// Annotation Processing
@Singleton
@Component(
    modules = [ActivityBuilder::class,
    AndroidSupportInjectionModule::class]
)
//Here i'll also put the ApiModule (If necessary)

interface ApplicationComponent : AndroidInjector<CarApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }

    override fun inject(application: CarApplication)
}