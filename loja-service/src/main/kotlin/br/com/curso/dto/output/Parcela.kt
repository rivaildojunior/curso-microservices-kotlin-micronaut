package br.com.curso.dto.output

import java.math.BigDecimal

data class Parcela(
        val valor: BigDecimal,
        var dataVencimento: String
)
