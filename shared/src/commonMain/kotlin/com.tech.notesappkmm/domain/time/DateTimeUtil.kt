package com.tech.notesappkmm.domain.time

import kotlinx.datetime.*

/**
 *   Created by Tarique Ansari on 25/07/23
 */

object DateTimeUtil {

    fun now(): LocalDateTime {
        return Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    }

    fun toEpochMills(localDateTime: LocalDateTime): Long {
        return localDateTime.toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()
    }

    fun formatDateTime(localDateTime: LocalDateTime): String {
        val month = localDateTime.month.name.lowercase().take(3).replaceFirstChar { it.uppercase() }
        val day =
            if (localDateTime.dayOfMonth < 10) "0${localDateTime.dayOfMonth}" else "${localDateTime.dayOfMonth}"
        val year = localDateTime.year
        val hour =
            if (localDateTime.hour < 10) "0${localDateTime.hour}" else "${localDateTime.hour}"
        val minute =
            if (localDateTime.minute < 10) "0${localDateTime.minute}" else "${localDateTime.minute}"
        return "$month $day $year, $hour:$minute"
    }

}