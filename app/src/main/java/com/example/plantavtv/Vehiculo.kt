package com.example.plantavtv

class Vehiculo {

    var marca: String = ""
    var patente: String = ""
    var modelo: String = ""
    var anio: Int = 0
    var kilometraje: Int = 0
        get() =field

        set(value) {
            var kilometros:Int=0
            field=value
            if(field<=5000){
                kilometros = 5000 - kilometraje
                println("No te corresponde aún hacer la verificación de tu vehiculo, aún te falta hacer ${kilometros} kilometros")
            }
        }

    var encendido : Boolean=false
    var velocidad : Int=0

    constructor()

    constructor(marca:String, patente:String, modelo:String,anio:Int, kilometraje:Int,encendido:Boolean, velocidad:Int){
        this.marca=marca
        this.patente=patente
        this.modelo=modelo
        this.anio=anio
        this.kilometraje=kilometraje
        this.encendido=encendido
        this.velocidad=velocidad
    }

    constructor(marca:String, patente:String, modelo:String,anio:Int, kilometraje:Int,encendido:Boolean){
        this.marca=marca
        this.patente=patente
        this.modelo=modelo
        this.anio=anio
        this.kilometraje=kilometraje
    }

    constructor(kilometraje: Int){
        this.kilometraje=kilometraje
    }


    fun menuAccionesAuto(){
        println("Acciones del vehiculo:")
        println("1-Estado el vehiculo")
        println("2-Encender")
        println("3-Apagar")
        println("4-Acelerar")
        println("5-Ver velocidad actual")
        println("6-Controlar velocidad")
        println("7-Detener")
        println("99-Salir")
    }

    fun encender(encendido: Boolean){
        this.encendido=true
        println("El vehiculo se encendió correctamente")
    }

    fun apagar(encendido: Boolean){
        this.encendido=false
        println("El vehiculo se apagó correctamente")
    }

    fun estadoDeEncendido(){
        this.encendido=encendido
        if (encendido==false){
            println("El vehiculo está apagado")
        }
        else{
            println("El vehiculo está encendido")
        }
    }

    fun acelerar(encendido: Boolean){
        if(this.encendido==true){
            println("El vehiculo ha comenzado a subir la velocidad")
        }
        else{
            println("Tienes que encender el vehiculo para poder acelerar")
        }

    }

    fun detener(velocidad: Int){
        while(this.velocidad>0){
            this.velocidad--
            println("Disminuyendo velocidad ${this.velocidad}")
        }
        println("El vehiculo se detuvo completamente")

    }

    fun controlarVelocidad(velocidad: Int){

        if(this.velocidad==20){
            println("Manten la velocidad actual")
        }
        if(this.velocidad>20){
            println("El vehiculo ha comenzado a disminuir la velocidad")
            while(this.velocidad>20){
                this.velocidad--
                println("Reduciendo velocidad a ${this.velocidad}")
            }
            println("Listo ahora manten la velocidad actual")
        }
        if(this.velocidad<20){
            println("El vehiculo ha comenzado a aumentar  la velocidad")
            while(this.velocidad<20){
                this.velocidad++
                println("Aumentando velocidad a ${this.velocidad}")
            }
            println("Listo ahora manten la velocidad actual")
        }



    }

}