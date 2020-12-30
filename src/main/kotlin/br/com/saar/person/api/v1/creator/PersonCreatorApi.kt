package br.com.saar.person.api.v1.creator

import br.com.saar.person.Person
import br.com.saar.person.api.v1.creator.dto.PersonRequestDto
import br.com.saar.person.api.v1.creator.dto.PersonResponseDto
import org.springframework.http.HttpEntity
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.validation.Valid

@RequestMapping("/v1")
interface PersonCreatorApi {

    @RequestMapping(value = ["/persons"], method = [RequestMethod.POST], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun saveCustomer(@Valid @RequestBody person:PersonRequestDto):HttpEntity<PersonResponseDto>
}