package br.com.curso.model

import java.math.BigDecimal

@NoArg
data class Parcela (
        var valor: BigDecimal,
        var dataVencimento: String
)