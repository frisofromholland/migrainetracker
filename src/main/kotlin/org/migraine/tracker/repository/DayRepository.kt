package org.migraine.tracker.repository

import org.migraine.tracker.domain.Day
import org.springframework.data.mongodb.repository.MongoRepository
import java.time.LocalDate

interface DayRepository : MongoRepository<Day, String> {

    fun findByDateBetween(from: LocalDate, to: LocalDate): List<Day>

}