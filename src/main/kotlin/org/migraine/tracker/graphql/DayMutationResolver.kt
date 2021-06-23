package org.migraine.tracker.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.migraine.tracker.domain.Day
import org.migraine.tracker.domain.dto.DayDto
import org.migraine.tracker.service.DayService
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalTime

@Service
class DayMutationResolver(private val dayService: DayService) : GraphQLMutationResolver {

    /**
     *  curl -X POST -H "Content-Type: application/json" -d '{"query": "mutation { addDay(year: 10, month: 1, dayOfMonth: 10, hours: 13, minute:35, severity: 5, medication: \"none\", comment: \"none\") {id } }"}' http://localhost:8080/graphql
     */
    fun addDay(
        year: Int, month: Int, dayOfMonth: Int,
        hours: Int, minute: Int,
        severity: Int,
        medication: String,
        comment: String
    ): DayDto {

        return dayService.save(
            Day(
                LocalDate.of(year, month, dayOfMonth),
                LocalTime.of(hours, minute),
                severity,
                medication,
                comment
            )
        )
    }

}