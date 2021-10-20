package br.com.curso.config

import redis.clients.jedis.Jedis
import redis.clients.jedis.JedisPool
import redis.clients.jedis.JedisPoolConfig

object Conexao {

    fun getConexao(): Jedis {
        val jedisPool = JedisPool(JedisPoolConfig(), "ms-redis", 6379)
        return jedisPool.resource
    }
}