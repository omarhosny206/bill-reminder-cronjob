package com.example

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class BillReminderCronJob : CommandLineRunner {
    private val log: Logger = LoggerFactory.getLogger(BillReminderCronJob::class.java)

    override fun run(vararg args: String?) {
        log.info("Cronjob is Running")
    }
}