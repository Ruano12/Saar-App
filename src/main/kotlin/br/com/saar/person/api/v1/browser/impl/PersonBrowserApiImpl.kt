package br.com.saar.person.api.v1.browser.impl

import br.com.saar.person.Person
import br.com.saar.person.PersonBrowser
import br.com.saar.person.api.v1.browser.PersonBrowserApi
import br.com.saar.person.api.v1.browser.dto.PersonDto
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@Transactional
class PersonBrowserApiImpl(val personBrowser:PersonBrowser) : PersonBrowserApi {

    override fun findById(id: UUID): HttpEntity<PersonDto> {
        var person:Optional<Person> = personBrowser.findById(id)

        var personDto:PersonDto = PersonDto.Companion.fromEntity(person.get())

        return ResponseEntity<PersonDto>(personDto, HttpStatus.OK)
    }
}