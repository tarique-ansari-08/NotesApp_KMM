package com.tech.notesappkmm.data.note

import com.tech.notesappkmm.domain.note.Note
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 *   Created by Tarique Ansari on 26/07/23
 */

fun NoteEntity.toNote(): Note {
    return Note(
        id = id,
        title = title,
        content = content,
        colorHex = colorHex,
        created = Instant
            .fromEpochMilliseconds(created)
            .toLocalDateTime(
                TimeZone.currentSystemDefault()
            )
    )
}