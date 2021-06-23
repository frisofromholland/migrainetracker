package org.migraine.tracker.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.migraine.tracker.domain.dto.DayDto
import org.migraine.tracker.service.DayService
import org.springframework.stereotype.Service

@Service
class DayQueryResolver(private val dayService: DayService) : GraphQLQueryResolver {


    /**
     * Example: curl -X POST -H "Content-Type: application/json" -d '{"query": "{ allDays(count: 10, offset: 1){id } }"}' http://localhost:8080/graphql
     */
    fun allDays(count: Int, offset: Int): List<DayDto> {
        return dayService.findAll()
    }

    fun allDays(): List<DayDto> {
        return dayService.findAll()
    }

}