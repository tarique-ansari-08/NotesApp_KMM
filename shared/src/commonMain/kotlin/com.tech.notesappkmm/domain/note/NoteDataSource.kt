package com.tech.notesappkmm.domain.note

/**
 *   Created by Tarique Ansari on 25/07/23
 */
interface NoteDataSource {
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Long): Note?
    suspend fun getAllNotes(): List<Note>
    suspend fun deleteNoteById(id: Long)

}