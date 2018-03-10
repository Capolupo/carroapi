package br.com.andrecapolupo.carroapi.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

//primeiro que fizemos
//ao usar isso tenho get setter prontos
@Document
data class Carro(@Id var id: String?,
                 var marca: String,
                 var modelo: String,
                 var ano: Int,
                 var placa: String){
/*    constructor(): this(id:"",
                        marca:"",
                        modelo:"",
                        ano:0,
                        placa:"")*/
}