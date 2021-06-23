package org.migraine.tracker.domain

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.LocalTime

@Document
data class Day(

    @Id
    var id: ObjectId,
    var date: LocalDate,
    var time: LocalTime,
    var severity: Int,
    var medication: String,
    var comment: String

) {
    constructor(
        date: LocalDate,
        time: LocalTime,
        severity: Int,
        medication: String,
        comment: String
    ) : this(ObjectId.get(), date, time, severity, medication, comment)

    override fun toString(): String {
        return "Day(id='$id', date=$date, time=$time, severity=$severity, medication='$medication', comment='$comment')"
    }
}