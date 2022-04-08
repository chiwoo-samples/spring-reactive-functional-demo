package example.chiwoo.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringReactiveApplication

fun main(args: Array<String>) {
	runApplication<SpringReactiveApplication>(*args)
}
