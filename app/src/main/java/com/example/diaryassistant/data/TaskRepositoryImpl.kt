package com.example.diaryassistant.data

import com.example.diaryassistant.data.database.TaskListDao
import com.example.diaryassistant.domain.TaskRepository
import com.example.diaryassistant.domain.model.task.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TaskRepositoryImpl(
    private val taskListDao: TaskListDao,
    private val mapper: TaskMapper
) : TaskRepository {
    override suspend fun addTask(task: Task) {
        taskListDao.upsertTask(mapper.mapEntityToDbModel(task))
    }

    override suspend fun deleteTask(task: Task) {
        taskListDao.deleteTask(mapper.mapEntityToDbModel(task))
    }

    override suspend fun editTask(task: Task) {
        taskListDao.upsertTask(mapper.mapEntityToDbModel(task))
    }

    override fun getGeneralTaskList(): Flow<List<Task>> = taskListDao.getGeneralTaskList().map {
        mapper.mapListDbModelToListEntity(it)
    }

    override fun getCategoryTaskList(category: String): Flow<List<Task>> =
        taskListDao.getCategoryTaskList(category).map { mapper.mapListDbModelToListEntity(it) }
}