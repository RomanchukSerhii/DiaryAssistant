package com.example.diaryassistant.domain

import com.example.diaryassistant.domain.model.task.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    suspend fun addTask(task: Task)

    suspend fun deleteTask(task: Task)

    suspend fun editTask(task: Task)

    fun getGeneralTaskList(): Flow<List<Task>>

    fun getCategoryTaskList(category: String): Flow<List<Task>>

}