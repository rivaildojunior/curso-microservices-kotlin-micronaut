package br.com.curso.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "veiculo")
data class Veiculo(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val modelo: String,
        val marca: String,
        val placa: String
)
