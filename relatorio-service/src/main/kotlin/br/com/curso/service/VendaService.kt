package br.com.curso.service

import br.com.curso.model.Venda
import br.com.curso.repository.VendaRepository
import jakarta.inject.Singleton

@Singleton
class VendaService(
        private val vendaRepository: VendaRepository
) {

    fun create(venda: Venda) {
        vendaRepository.create(venda)
    }

    fun getAll(): List<Venda> {
        return vendaRepository.getAll()
    }
}