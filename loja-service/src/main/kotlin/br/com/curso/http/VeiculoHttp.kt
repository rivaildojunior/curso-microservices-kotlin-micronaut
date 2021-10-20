package br.com.curso.http

import br.com.curso.dto.output.Veiculo
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker

@Client(id = "veiculo-service")
@CircuitBreaker
interface VeiculoHttp {

    @Get("/veiculos/{id}")
    fun findById(@PathVariable id: Long): Veiculo
}