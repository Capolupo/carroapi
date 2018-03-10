package br.com.andrecapolupo.carroapi.repository

import br.com.andrecapolupo.carroapi.entity.Carro
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

//segundo que fizemos
@Repository
interface  CarroRepository: MongoRepository<Carro, String> { //Aqui o sistema ja faz auto (Salvar, editar .. etc..)

    fun findByAno(ano: Int):List<Carro>

    fun findByMarcaContaining(marca: String): List<Carro>

    fun findByPlacaContaining(placa: String): List<Carro>

    fun findByAnoContaining(ano: Int): List<Carro>
}