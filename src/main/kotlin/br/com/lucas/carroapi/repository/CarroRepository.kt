package br.com.lucas.carroapi.repository

import br.com.lucas.carroapi.entity.Carro
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CarroRepository : MongoRepository<Carro, String>{
    fun findByAno(ano: Int) : List<Carro>
    fun findByPlaca (placa: String) : Carro
    fun findByMarcaContaining (Marca: String): List<Carro>
}