package com.example.noteapp.feature_note.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class DataBase: RoomDatabase() {
    abstract val noteDao: NoteDaoInterface

    companion object{
        const val DATABASE_NAME = "notes_db"
    }
}
