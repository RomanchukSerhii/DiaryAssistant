package com.example.diaryassistant.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.diaryassistant.domain.model.task.Priority
import com.example.diaryassistant.domain.model.task.Task

@Entity(tableName = "tasks")
class TaskDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val category: String,
    val priority: Priority
) {
}