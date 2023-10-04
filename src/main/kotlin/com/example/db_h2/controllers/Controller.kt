package com.example.db_h2.controllers

import com.example.db_h2.db.Person
import com.example.db_h2.db.repository.PersonRep
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class Controller (private val personRep: PersonRep){
    @GetMapping("/hello")
    fun hello(): String {
        return "Масло черного тмина!"
    }
    @PostMapping("/users")
    fun createPerson(@RequestBody person: Person):Person {
        return personRep.save(person)
    }
    /*    @GetMapping("/User")
        fun checkUser(@RequestBody)*/
    @GetMapping("/{id}")
    fun getTask(@PathVariable id: Long): Person {
        return personRep.findById(id).orElseThrow { ChangeSetPersister.NotFoundException() }
    }
}
