package com.example.demo.controller

import com.example.demo.entities.Contact
import com.example.demo.repositories.ContactRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/contacts")
class ContactController {
    @Autowired
    lateinit var repository: ContactRepository
    @GetMapping
    fun index(): List<Contact>{
        return repository.findAll()
    }
    @PostMapping
    fun create(@RequestBody contact: Contact): Contact{
        return repository.save(contact)

    }

}