package br.com.saar.person.api.v1.creator.dto

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.util.*

class PersonResponseDto : Serializable {
    private val serialVersionUID:Long = 1L

    @JsonProperty(value = "person-id")
    private var personId: UUID? = null

    fun getPersonId():UUID? = this.personId

    fun setPersonId(personId:UUID){
        this.personId = personId
    }
}