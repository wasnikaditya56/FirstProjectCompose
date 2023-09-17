package com.aditya.wasnik.firstprojectcompose.todo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Insert(onConflict = REPLACE)
    suspend fun insert(todo:Todo)

    @Query("SELECT * FROM todoTable")
    fun getAllTodos():Flow<List<Todo>>
}