package br.com.saar.person.impl

import br.com.saar.person.Person
import br.com.saar.person.PersonRepository
import br.com.saar.person.PersonBrowser
import br.com.saar.person.PersonNotFoundException
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonBrowserImpl(val personRepository: PersonRepository) : PersonBrowser {

    override fun findById(id: UUID): Optional<Person> {
        var person:Optional<Person>  = personRepository.findById(id)

        if(!person.isPresent){
            throw PersonNotFoundException(String.format("Não encontrado pessoa com o id %s.", id))
        }

        return person
    }
}