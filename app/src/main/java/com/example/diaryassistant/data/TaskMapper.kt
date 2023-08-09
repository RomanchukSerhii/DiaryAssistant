package com.example.diaryassistant.data

import com.example.diaryassistant.data.database.TaskDbModel
import com.example.diaryassistant.domain.model.task.Task

class TaskMapper {
    fun mapDbModelToEntity(dbModel: TaskDbModel): Task {
        return Task(
            id = dbModel.id,
            name = dbModel.name,
            category = dbModel.category,
            priority = dbModel.priority
        )
    }

    fun mapEntityToDbModel(entity: Task): TaskDbModel {
        return TaskDbModel(
            id = entity.id,
            name = entity.name,
            category = entity.category,
            priority = entity.priority
        )
    }

    fun mapListDbModelToListEntity(listDbModel: List<TaskDbModel>) = listDbModel.map {
        mapDbModelToEntity(it)
    }
}