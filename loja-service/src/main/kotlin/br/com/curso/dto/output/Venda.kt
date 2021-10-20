package br.com.curso.dto.output

import java.math.BigDecimal

data class Venda(
        val cliente: String,
        val veiculo: Veiculo,
        val valor: BigDecimal,
        val parcelas: List<Parcela>
)
