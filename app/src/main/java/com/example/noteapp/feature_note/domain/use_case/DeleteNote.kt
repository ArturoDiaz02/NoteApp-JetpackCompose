package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.data.repository.Repository
import com.example.noteapp.feature_note.domain.model.Note

class DeleteNote(
    private val repository: Repository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}