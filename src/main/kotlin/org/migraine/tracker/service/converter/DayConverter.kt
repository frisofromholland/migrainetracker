package org.migraine.tracker.service.converter

import org.bson.types.ObjectId
import org.migraine.tracker.domain.Day
import org.migraine.tracker.domain.dto.Date
import org.migraine.tracker.domain.dto.DayDto
import org.migraine.tracker.domain.dto.Time
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalTime

@Service
class DayConverter : Converter<Day, DayDto> {

    override fun convertToDto(day: Day): DayDto =
        DayDto(
            day.id.toHexString(),
            Date(day.date.year, day.date.monthValue, day.date.dayOfMonth),
            Time(day.time.hour, day.time.minute),
            day.severity,
            day.medication,
            day.comment
        )

    override fun convertFromDto(dto: DayDto): Day =
        Day(
            ObjectId(dto.id),
            LocalDate.of(dto.date.year, dto.date.month, dto.date.day),
            LocalTime.of(dto.time.hour, dto.time.minute),
            dto.severity, dto.medication, dto.comment
        )
}