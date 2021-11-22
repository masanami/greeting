package com.example.greeting.api

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("coroutine")
class CoroutineController {

    @GetMapping
    fun get(): String{
        CoroutineScope(Dispatchers.Default).launch {
            delay(3000)
            println("コルーチンの中")
        }
        return "Hello World!!"
    }
}
