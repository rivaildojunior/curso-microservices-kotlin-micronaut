package br.com.curso.model

import java.math.BigDecimal

@NoArg
data class Venda(

        var cliente: String,
        var veiculo: Veiculo,
        var valor: BigDecimal,
        var parcelas: List<Parcela>
)
