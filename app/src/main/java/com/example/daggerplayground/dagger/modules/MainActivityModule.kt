package com.example.daggerplayground.dagger.modules

import androidx.fragment.app.FragmentActivity
import com.example.daggerplayground.Car
import com.example.daggerplayground.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {

    @Binds
    abstract fun provideMainActivity(activity: MainActivity): FragmentActivity

//    @Provides
//    fun provideMainActivity(): FragmentActivity {
//        return FragmentActivity()
//    }
}