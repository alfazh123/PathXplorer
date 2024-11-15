package com.example.pathxplorer.ui.utils

import com.example.pathxplorer.R

// this is nessasary before API from CC is Complete

data class Kampus(
    val name: String,
    val location: String,
    val image: Int
)

fun generateListKampus(): ArrayList<Kampus> {
    val listKampus = ArrayList<Kampus>()

    for (i in 1..20) {
        listKampus.add(
            Kampus(
                "Kampus $i",
                "Location $i",
                R.drawable.univ
            )
        )
    }

    return listKampus
}

data class Major (
    val name: String,
    val faculy: String,
    val image: Int
)

fun generateListMajor(): ArrayList<Major> {
    val listMajor = ArrayList<Major>()

    for (i in 1..20) {
        listMajor.add(
            Major(
                "Major $i",
                "Faculty $i",
                R.drawable.ic_launcher_foreground
            )
        )
    }

    return listMajor
}

data class Webinar (
    val name: String,
    val date: String,
    val image: Int
)

fun generateListWebinar(): ArrayList<Webinar> {
    val listWebinar = ArrayList<Webinar>()

    for (i in 1..5) {
        listWebinar.add(
            Webinar(
                "Webinar $i",
                "$i Januari 2024",
                R.drawable.webinar
            )
        )
    }

    return listWebinar
}

val filterKampus = listOf(
    "All",
    "Private",
    "State",
    "Religious",
    "Foreign"
)