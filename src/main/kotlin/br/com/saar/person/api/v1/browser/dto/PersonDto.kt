package br.com.saar.person.api.v1.browser.dto

import br.com.saar.person.Person
import br.com.saar.person.PersonTypeEnum
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

class PersonDto {

    @JsonProperty(value = "id")
    private var id:UUID? = null

    @JsonProperty(value = "name")
    private var name:String? = null

    @JsonProperty(value = "document")
    private var document:String? = null

    @JsonProperty(value = "person-type")
    private var personType:PersonTypeEnum? = null

    fun getId():UUID? = this.id;

    fun setId(id:UUID){
        this.id = id
    }

    fun getName(): String? = this.name

    fun setName(name:String?){
        this.name = name
    }

    fun getDocument(): String? = this.document

    fun setDocument(document:String?){
        this.document = document
    }

    fun getPersonType(): PersonTypeEnum? = this.personType

    fun setPersonType(personType: PersonTypeEnum?){
        this.personType = personType
    }

    companion object {
        fun fromEntity(person: Person) :PersonDto {
            var personDto:PersonDto = PersonDto()
            personDto.setDocument(person.getDocument())
            personDto.setId(person.getId())
            personDto.setName(person.getName())
            personDto.setPersonType(person.getPersonType())

            return personDto
        }
    }
}