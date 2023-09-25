package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BillReminderCronApplication

fun main(args: Array<String>) {
	runApplication<BillReminderCronApplication>(*args)
}
