package br.com.lucas.carroapi.controller

import br.com.lucas.carroapi.entity.Carro
import br.com.lucas.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CarroController{


    @Autowired

    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos(): List<Carro> {
        return carroService.buscarTodosCarros()
    }

    @PostMapping
    fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }
}