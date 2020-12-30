package br.com.saar.person.api.v1.browser

import br.com.saar.person.api.v1.browser.dto.PersonDto
import org.springframework.http.HttpEntity
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import java.util.*

@RequestMapping("/v1")
interface PersonBrowserApi {

    @RequestMapping(value = ["/persons"], method = [RequestMethod.GET], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findById(@RequestParam("id") id:UUID):HttpEntity<PersonDto>
}