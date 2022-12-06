package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.data.repository.Repository

class GetNoteId(
    private val repository: Repository
){
    suspend operator fun invoke(id: Int) = repository.getNoteById(id)
}