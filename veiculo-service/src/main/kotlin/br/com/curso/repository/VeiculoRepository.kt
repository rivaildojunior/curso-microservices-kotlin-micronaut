package br.com.curso.repository

import br.com.curso.model.Veiculo
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface VeiculoRepository: JpaRepository<Veiculo, Long> {
}