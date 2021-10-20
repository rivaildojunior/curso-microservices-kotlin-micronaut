package br.com.curso.http.fallback

import br.com.curso.config.Conexao
import br.com.curso.dto.output.Veiculo
import br.com.curso.http.VeiculoHttp
import com.fasterxml.jackson.databind.ObjectMapper
import io.micronaut.retry.annotation.Fallback
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig

@Fallback
class VeiculoHttpFallback(
        private val objectMapper: ObjectMapper
): VeiculoHttp {

    override fun findById(id: Long): Veiculo {
        var jedis = Conexao.getConexao()
        val veiculoJSON = jedis.get(id.toString())
        val veiculo = objectMapper.readValue(veiculoJSON, Veiculo::class.java)
        return veiculo;
    }
}