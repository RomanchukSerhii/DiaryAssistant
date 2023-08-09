package com.example.diaryassistant.di.module

import android.app.Application
import com.example.diaryassistant.data.TaskRepositoryImpl
import com.example.diaryassistant.data.database.AppDatabase
import com.example.diaryassistant.data.database.TaskListDao
import com.example.diaryassistant.di.annotation.ApplicationScope
import com.example.diaryassistant.domain.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindTaskRepository(taskRepositoryImpl: TaskRepositoryImpl): TaskRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideTaskListDao(application: Application): TaskListDao {
            return AppDatabase.getInstance(application).taskListDao()
        }
    }
}