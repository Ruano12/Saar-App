package br.com.saar.handler

interface ErrorMappingAware {

    fun getMapping():Array<ErrorMapping>?
}