package org.migraine.tracker.service.converter

interface Converter<T, D> {

    fun convertToDto(t: T): D
    fun convertFromDto(d: D): T

}