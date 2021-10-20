package br.com.curso.model

@NoArg
data class Veiculo (
        var id: Long,
        var marca: String,
        var modelo: String,
        var placa: String
)