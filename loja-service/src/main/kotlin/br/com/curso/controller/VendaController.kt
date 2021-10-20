package br.com.curso.controller

import br.com.curso.dto.input.VendaInput
import br.com.curso.service.VendaService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/vendas")
class VendaController(
        private val vendaService: VendaService
) {



    @Post
    fun realizarVenda(@Body vendaInput: VendaInput){
        vendaService.realizarVenda(vendaInput)
    }
}