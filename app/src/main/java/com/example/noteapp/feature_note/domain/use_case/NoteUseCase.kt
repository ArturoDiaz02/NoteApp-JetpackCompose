package com.example.noteapp.feature_note.domain.use_case

data class NoteUseCase(
    val addNote: AddNote,
    val deleteNote: DeleteNote,
    val getNoteId: GetNoteId,
    val getNotes: GetNotes
)