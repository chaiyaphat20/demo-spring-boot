package com.itgenius.springdemo.controllers

import com.itgenius.springdemo.models.Demodata
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class DemoController {
    @GetMapping("/hello")
    fun hello():String {
        return  "Hello,Spring boot"
    }

    @GetMapping("/about")
    fun about():String {
        return  "About,Spring boot"
    }

    @GetMapping("/demodata")
    fun getDemoData():List<Demodata> {
        return  listOf(
            Demodata(1,"Art", "chaiyaphat@gmail.com","09988848484","123 bank"),
            Demodata(2,"Jane", "chaiyaphat@gmail.com","09988848484","123 bank"),
        )
    }
}