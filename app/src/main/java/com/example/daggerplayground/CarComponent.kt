package com.example.daggerplayground

import dagger.Component

// The Injector
// Annotation Processing
@Component
interface CarComponent {
    fun getCar(): Car
}