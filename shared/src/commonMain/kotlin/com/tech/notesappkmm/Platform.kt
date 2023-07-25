package com.tech.notesappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform