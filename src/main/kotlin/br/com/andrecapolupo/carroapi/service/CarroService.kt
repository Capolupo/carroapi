package br.com.andrecapolupo.carroapi.service

import br.com.andrecapolupo.carroapi.entity.Carro
import br.com.andrecapolupo.carroapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService{
    @Autowired // injeta um valor automatico para nós
    lateinit var carroRepository: CarroRepository

    fun buscarTodosCarros():List<Carro>{
        return carroRepository.findAll()
    }

    fun buscarCarroPorMarca(marca: String): List<Carro>{
        return carroRepository.findByMarcaContaining(marca)
    }

    fun buscarCarroPorPlaca(placa: String): List<Carro>{
        return carroRepository.findByPlacaContaining(placa)
    }

    fun buscarCarroPorAno(ano: Int): List<Carro>{
        return carroRepository.findByAnoContaining(ano)
    }

    fun salvar(carro: Carro){
        carroRepository.save(carro)
    }
}