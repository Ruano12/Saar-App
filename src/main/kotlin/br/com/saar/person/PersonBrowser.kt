package br.com.saar.person

import java.util.*

interface PersonBrowser {
    fun findById(id: UUID):Optional<Person>
}