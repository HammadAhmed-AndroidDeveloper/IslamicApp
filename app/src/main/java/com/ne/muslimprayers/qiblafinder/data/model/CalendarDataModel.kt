package com.ne.muslimprayers.qiblafinder.data.model

data class CalendarDataModel(
    val day: Int,
    val month: Int,
    val monthDesignation: String,
    val year: Int,
    val yearDesignation: String,
    val weekday: String,
    val date: String,
    val holidays: List<String>
)