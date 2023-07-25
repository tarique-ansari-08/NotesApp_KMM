package com.tech.notesappkmm.domain.note

import com.tech.notesappkmm.domain.time.DateTimeUtil

/**
 *   Created by Tarique Ansari on 26/07/23
 */
class SearchNotes {

    fun execute(notes: List<Note>, query: String): List<Note> {
        if (query.isBlank()) {
            return notes
        }
        return notes.filter {
            it.title.trim().lowercase().contains(query.lowercase()) ||
                    it.content.trim().lowercase().contains(query.lowercase())
        }.sortedBy {
            DateTimeUtil.toEpochMills(it.created)
        }
    }

}