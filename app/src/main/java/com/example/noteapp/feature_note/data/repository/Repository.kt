package com.example.noteapp.feature_note.data.repository

import com.example.noteapp.feature_note.data.source.NoteDaoInterface
import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NoteRepositoryInterface
import kotlinx.coroutines.flow.Flow

class Repository(
    private val dao: NoteDaoInterface
): NoteRepositoryInterface {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }

}
