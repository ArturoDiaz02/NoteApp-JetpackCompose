package com.example.noteapp.di

import android.app.Application
import androidx.room.Room
import com.example.noteapp.feature_note.data.repository.Repository
import com.example.noteapp.feature_note.data.source.DataBase
import com.example.noteapp.feature_note.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(
        app: Application
    ) = Room.databaseBuilder(
        app,
        DataBase::class.java,
        DataBase.DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRepository(db: DataBase) = Repository(db.noteDao)

    @Provides
    @Singleton
    fun provideUseCases(
        repository: Repository
    ) = NoteUseCase(
        addNote = AddNote(repository),
        deleteNote = DeleteNote(repository),
        getNoteId = GetNoteId(repository),
        getNotes = GetNotes(repository)
    )

}