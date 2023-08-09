package com.example.diaryassistant.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.diaryassistant.domain.model.task.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskListDao {

    @Query("SELECT * FROM tasks")
    fun getGeneralTaskList(): Flow<List<TaskDbModel>>

    @Query("SELECT * FROM tasks WHERE category=:category")
    fun getCategoryTaskList(category: String): Flow<List<TaskDbModel>>

    @Upsert
    suspend fun upsertTask(task: TaskDbModel)

    @Delete
    suspend fun deleteTask(task: TaskDbModel)
}