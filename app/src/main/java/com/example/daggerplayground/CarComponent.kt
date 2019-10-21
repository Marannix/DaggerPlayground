package com.example.daggerplayground

import android.app.Application
import dagger.BindsInstance
import dagger.Component

// The Injector
// Annotation Processing
@Component
interface CarComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): CarComponent
    }

    fun inject(application: Application)
}