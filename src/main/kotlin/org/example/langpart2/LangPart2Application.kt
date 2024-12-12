package org.example.langpart2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient //Eureka Client
class LangPart2Application

fun main(args: Array<String>) {
    runApplication<LangPart2Application>(*args)
}
