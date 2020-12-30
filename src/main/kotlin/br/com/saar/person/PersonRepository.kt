package br.com.saar.person

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PersonRepository: JpaRepository<Person, UUID> {

}