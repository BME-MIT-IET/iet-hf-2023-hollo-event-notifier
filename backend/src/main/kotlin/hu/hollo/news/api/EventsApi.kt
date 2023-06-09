/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package hu.hollo.news.api

import hu.hollo.news.model.dto.ErrorDto
import hu.hollo.news.model.dto.EventDto
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@Validated
@RequestMapping("\${api.base-path:}")
interface EventsApi {


    @RequestMapping(
            method = [RequestMethod.PUT],
            value = ["/events"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createEvent( @Valid @RequestBody eventDto: EventDto): ResponseEntity<EventDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.DELETE],
            value = ["/events/{id}"],
            produces = ["application/json"]
    )
    fun deleteEventById( @PathVariable("id") id: java.util.UUID): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/events/{id}"],
            produces = ["application/json"]
    )
    fun getEventById( @PathVariable("id") id: java.util.UUID): ResponseEntity<EventDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/events"],
            produces = ["application/json"]
    )
    fun getEvents(@NotNull  @Valid @RequestParam(value = "startDate", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) startDate: java.time.OffsetDateTime,@NotNull  @Valid @RequestParam(value = "endDate", required = true) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) endDate: java.time.OffsetDateTime): ResponseEntity<List<EventDto>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/events/{id}"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateEventById( @PathVariable("id") id: java.util.UUID, @Valid @RequestBody eventDto: EventDto): ResponseEntity<EventDto> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
