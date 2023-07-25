package com.tech.notesappkmm.data.local

import com.squareup.sqldelight.db.SqlDriver

/**
 *   Created by Tarique Ansari on 26/07/23
 */
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}