package com.example.db_h2.db.repository

import com.example.db_h2.db.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRep : JpaRepository<Person, Long> {
}




