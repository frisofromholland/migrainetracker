package org.migraine.tracker.service.converter

import org.migraine.tracker.domain.Day
import org.migraine.tracker.domain.dto.DayDto
import org.springframework.stereotype.Service

@Service
class DayConverter : Converter<Day, DayDto> {

    override fun convertToDto(day: Day): DayDto =
        DayDto(day.id, day.date, day.time, day.severity, day.medication, day.comment)

    override fun convertFromDto(dto: DayDto): Day =
        Day(dto.id, dto.date, dto.time, dto.severity, dto.medication, dto.comment)
}