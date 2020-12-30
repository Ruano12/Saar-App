package br.com.saar.handler

import br.com.saar.person.InvalidPersonException
import br.com.saar.person.PersonNotFoundException
import javassist.NotFoundException
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import java.lang.IllegalArgumentException
import javax.validation.constraints.NotNull

@Validated
@Component
class DefaultErrorMapping : ErrorMappingAware{

    private var mapping: Array<ErrorMapping>? = null

    constructor(@NotNull(message = "Informe o ErrorMapping") mapping:Array<ErrorMapping>?){
        this.mapping = mapping
    }

    constructor(){
        this.mapping = createDefaultMapping()
    }

    private fun createDefaultMapping():Array<ErrorMapping>? {
        var mapping:Array<ErrorMapping> = arrayOf(ErrorMapping("E002", IllegalArgumentException::class.java, HttpStatus.BAD_REQUEST),
            ErrorMapping("E003", InvalidPersonException::class.java, HttpStatus.BAD_REQUEST),
            ErrorMapping("E002", PersonNotFoundException::class.java, HttpStatus.NOT_FOUND))
        return mapping
    }

    override fun getMapping(): Array<ErrorMapping>? = this.mapping
}