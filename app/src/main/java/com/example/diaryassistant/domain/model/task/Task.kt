package com.example.diaryassistant.domain.model.task

data class Task(
    val name: String,
    val category: String,
    val priority: Priority,
    var id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = 0
    }
}
