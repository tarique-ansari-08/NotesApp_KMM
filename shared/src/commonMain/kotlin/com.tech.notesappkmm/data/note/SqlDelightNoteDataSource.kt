package com.tech.notesappkmm.data.note

import com.tech.notesappkmm.database.NoteDatabase
import com.tech.notesappkmm.domain.note.Note
import com.tech.notesappkmm.domain.note.NoteDataSource
import com.tech.notesappkmm.domain.time.DateTimeUtil

/**
 *   Created by Tarique Ansari on 25/07/23
 */
class SqlDelightNoteDataSource(db: NoteDatabase) : NoteDataSource {

    private val queries = db.noteQueries
    override suspend fun insertNote(note: Note) {
        queries.insertNote(
            id = note.id,
            title = note.title,
            content = note.content,
            colorHex = note.colorHex,
            created = DateTimeUtil.toEpochMills(note.created)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        return queries.getNoteById(id).executeAsOneOrNull()?.toNote()
    }

    override suspend fun getAllNotes(): List<Note> {
        return queries.getAllNotes().executeAsList().map { it.toNote() }
    }

    override suspend fun deleteNoteById(id: Long) {
        return queries.deleteNoteById(id)
    }
}