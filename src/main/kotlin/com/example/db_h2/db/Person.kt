package com.example.db_h2.db
import jakarta.persistence.*

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long,
    @Column(name = "person_name")
    var name: String,
    @Column(name = "person_message")
    val message: String
)
