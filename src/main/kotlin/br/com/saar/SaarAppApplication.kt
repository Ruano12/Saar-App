package br.com.saar

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SaarAppApplication

fun main(args: Array<String>) {
	runApplication<SaarAppApplication>(*args)
}
