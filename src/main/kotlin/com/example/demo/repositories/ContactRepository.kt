package com.example.demo.repositories

import com.example.demo.entities.Contact
import org.springframework.data.jpa.repository.JpaRepository

interface ContactRepository: JpaRepository<Contact, Long> {
}