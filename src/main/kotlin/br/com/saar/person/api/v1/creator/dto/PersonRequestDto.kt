package br.com.saar.person.api.v1.creator.dto

import br.com.saar.person.InvalidPersonException
import br.com.saar.person.Person
import br.com.saar.person.PersonTypeEnum
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.util.*

class PersonRequestDto : Serializable {

    private val serialVersionUID:Long = 1L

    @JsonProperty(value = "name")
    private var name:String? = null

    @JsonProperty(value = "document")
    private var document:String? = null

    @JsonProperty(value = "person-type")
    private var personType: PersonTypeEnum? = null

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

    fun toEntity():Person {
        var person:Person = Person()

        if(Objects.isNull(this.document)) throw InvalidPersonException("Documento não pode ser nulo")
        if(Objects.isNull(this.name)) throw InvalidPersonException("Nome não pode ser nulo")
        if(Objects.isNull(this.personType)) throw InvalidPersonException("Tipo de pessoa não pode ser nulo")

        person.setDocument(this.document)
        person.setName(this.name)
        person.setPersonType(this.personType!!)

        return person
    }
}