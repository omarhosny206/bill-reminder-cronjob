import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class BillReminderCronJob : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Bill Reminder Cronjob")
    }
}