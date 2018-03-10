package br.com.andrecapolupo.carroapi.controller

import br.com.andrecapolupo.carroapi.entity.Carro
import br.com.andrecapolupo.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")//isso é uma especie de Filter

class CarroController{

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos():List<Carro>{
        return carroService.buscarTodosCarros()
        }

    @PostMapping
     fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }

}