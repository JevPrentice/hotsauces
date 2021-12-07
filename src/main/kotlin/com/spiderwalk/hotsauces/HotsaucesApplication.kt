package com.spiderwalk.hotsauces

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

// https://auth0.com/blog/build-and-secure-an-api-with-spring-boot/
@SpringBootApplication
class HotsaucesApplication

fun main(args: Array<String>) {
    runApplication<HotsaucesApplication>(*args)
}
