package org.migraine.tracker.domain

import org.springframework.data.annotation.Id
import java.time.LocalDate
import java.time.LocalTime

class Day(

    @Id
    var id: String,
    var date: LocalDate,
    var time: LocalTime,
    var severity: Integer,
    var medication: String,
    var comment: String

) {

    override fun toString(): String {
        return "Day(id='$id', date=$date, time=$time, severity=$severity, medication='$medication', comment='$comment')"
    }
}