package br.com.saar.handler

import org.springframework.http.HttpStatus

interface ExceptionWithErrorCode {
    fun getErrorCode():String
    fun getHttpStatus():HttpStatus
}