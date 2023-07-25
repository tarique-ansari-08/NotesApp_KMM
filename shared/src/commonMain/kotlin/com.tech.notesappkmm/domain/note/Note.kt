package com.tech.notesappkmm.domain.note

import com.tech.notesappkmm.presentation.*
import kotlinx.datetime.LocalDateTime

/**
 *   Created by Tarique Ansari on 25/07/23
 */
data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedPinkHex, RedOrangeHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}
