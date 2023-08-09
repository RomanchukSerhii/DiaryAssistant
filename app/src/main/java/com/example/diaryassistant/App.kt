package com.example.diaryassistant

import android.app.Application
import com.example.diaryassistant.di.component.DaggerApplicationComponent

class App : Application() {
    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}