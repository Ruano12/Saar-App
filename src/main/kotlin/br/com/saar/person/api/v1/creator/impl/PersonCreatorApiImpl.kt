package br.com.saar.person.api.v1.creator.impl

import br.com.saar.person.Person
import br.com.saar.person.PersonCreator
import br.com.saar.person.api.v1.creator.PersonCreatorApi
import br.com.saar.person.api.v1.creator.dto.PersonRequestDto
import br.com.saar.person.api.v1.creator.dto.PersonResponseDto
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RestController

@RestController
@Transactional
class PersonCreatorApiImpl(val personCreator: PersonCreator): PersonCreatorApi {

    override fun saveCustomer(person: PersonRequestDto): HttpEntity<PersonResponseDto> {
        var personPersist:Person = personCreator.save(person.toEntity())

        var personDto:PersonResponseDto = PersonResponseDto()
        personDto.setPersonId(personPersist.getId()!!)

        return ResponseEntity<PersonResponseDto>(personDto, HttpStatus.OK)
    }
}