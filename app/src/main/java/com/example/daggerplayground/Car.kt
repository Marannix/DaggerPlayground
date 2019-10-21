package com.example.daggerplayground

import android.util.Log
import javax.inject.Inject

private const val TAG = "Car"

class Car @Inject constructor() {
    @Inject lateinit var wheels: Wheels
    @Inject lateinit var engine: Engine

    fun drive() {
        Log.d(TAG, "driving...")
    }
}