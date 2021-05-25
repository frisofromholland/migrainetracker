package org.migraine.tracker.domain.dto

import java.time.LocalDate
import java.time.LocalTime

data class DayDto(
    var id: String,
    var date: LocalDate,
    var time: LocalTime,
    var severity: Integer,
    var medication: String,
    var comment: String
)
