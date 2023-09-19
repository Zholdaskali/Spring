package com.example.db_h2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DbH2Application

fun main(args: Array<String>) {
	runApplication<DbH2Application>(*args)
}
