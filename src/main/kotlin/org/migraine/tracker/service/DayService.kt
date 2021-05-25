package org.migraine.tracker.service

import org.migraine.tracker.domain.Day
import org.migraine.tracker.domain.dto.DayDto
import org.migraine.tracker.repository.DayRepository
import org.migraine.tracker.service.converter.DayConverter
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

@Service
@Transactional
class DayService(private val dayRepository: DayRepository, private val dayConverter: DayConverter) {

    fun save(day: Day): DayDto = dayConverter.convertToDto(dayRepository.save(day))

    fun findAll(): List<DayDto> = dayRepository.findAll().map { day -> dayConverter.convertToDto(day) }

    fun findByYearAndMonth(year: Int, month: Int): List<DayDto> {
        val from = LocalDate.of(year, month, 1)
        val to = from.plusMonths(1)

        return dayRepository.findByDateBetween(from.minusDays(1), to).map { day -> dayConverter.convertToDto(day) }
    }

}