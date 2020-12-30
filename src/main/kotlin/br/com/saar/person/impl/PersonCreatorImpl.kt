package br.com.saar.person.impl

import br.com.saar.person.Person
import br.com.saar.person.PersonCreator
import br.com.saar.person.PersonRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RestController

@Component
class PersonCreatorImpl(val personRepository: PersonRepository): PersonCreator {

    override fun save(person: Person): Person = personRepository.save(person)
}