package com.example.diaryassistant.domain.usecase

import com.example.diaryassistant.domain.TaskRepository
import com.example.diaryassistant.domain.model.task.Task
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetGeneralTaskListUseCase @Inject constructor(
    private val repository: TaskRepository
) {
    operator fun invoke(category: String): Flow<List<Task>> {
        return repository.getCategoryTaskList(category)
    }
}