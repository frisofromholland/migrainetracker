package org.migraine.tracker.domain.dto

import java.time.LocalDate
import java.time.LocalTime

data class DayDto(
    var id: String,
    var date: Date,
    var time: Time,
    var severity: Int,
    var medication: String,
    var comment: String
)

data class Date(
    var year: Int,
    var month: Int,
    var day: Int
)

data class Time(
    var hour: Int,
    var minute: Int
)