package com.example.diaryassistant.di.component

import android.app.Application
import com.example.diaryassistant.di.annotation.ApplicationScope
import dagger.BindsInstance
import dagger.Component
import dagger.Component.Factory

@ApplicationScope
@Component
class ApplicationComponent {

    @Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}