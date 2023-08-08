package com.example.diaryassistant.domain.usecase

import com.example.diaryassistant.domain.TaskRepository
import com.example.diaryassistant.domain.model.task.Task
import kotlinx.coroutines.flow.Flow

class GetCategoryTaskListUseCase(
    private val repository: TaskRepository
) {
    operator fun invoke(): Flow<List<Task>> {
        return repository.getGeneralTaskList()
    }
}