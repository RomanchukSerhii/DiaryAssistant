package com.example.diaryassistant.domain.usecase

import com.example.diaryassistant.domain.TaskRepository
import com.example.diaryassistant.domain.model.task.Task
import javax.inject.Inject

class DeleteTaskUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(task: Task) {
        repository.deleteTask(task)
    }
}