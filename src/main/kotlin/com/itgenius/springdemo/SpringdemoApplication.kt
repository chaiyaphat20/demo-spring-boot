package com.itgenius.springdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import org.springframework.web.bind.annotation.GetMapping
//import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringdemoApplication

//@RestController
//class HelloController {
//	@GetMapping("/")
//	fun hello(): String {
//		return "Hello, Spring Boot 777!8"
//	}
//}

fun main(args: Array<String>) {
	runApplication<SpringdemoApplication>(*args)
}
