package com.example.plantavtv

fun main() {

    var opcion:Int=0

    //crear un objeto de la clase vehiculo
    var auto1 = Vehiculo()


    while(auto1.kilometraje<=5000){
        println("Bienvenido a la planta VTV, a continuación te vamos a solicitar algunos datos de tu vehiculo:")
        println("¿Que modelo es?")
        auto1.modelo=readLine().toString()
        println("¿Cual es la marca?")
        auto1.marca= readLine().toString()
        println("¿Que año?")
        auto1.anio= readLine()?.toIntOrNull()!!
        println("Ingresa la patente: ")
        auto1.patente=readLine().toString()
        println("¿Cual es el kilometraje actual?")
        auto1.kilometraje= readLine()?.toIntOrNull()!!
        auto1.encendido=false
        auto1.velocidad=25
        println("----------------------------------------------")

        while(opcion!=99 && auto1.kilometraje>5000){
            auto1.menuAccionesAuto()
            println("¿Dime cual acción quieres ejecutar?")
            opcion= readLine()?.toIntOrNull()!!
            when(opcion){
                1->{auto1.estadoDeEncendido()
                    println("------------------------")}
                2->{auto1.encender(auto1.encendido)
                    println("------------------------")}
                3->{auto1.apagar(auto1.encendido)
                    println("------------------------")}
                4->{auto1.acelerar(auto1.encendido)
                    println("------------------------")}
                5->{println("La velocidad actual del vehiculo es de ${auto1.velocidad} km/h")
                    println("------------------------")}
                6->{auto1.controlarVelocidad(auto1.velocidad)
                    println("------------------------")}
                7->{auto1.detener(auto1.velocidad)
                    println("------------------------")}
                99->{println("Prueba finalizada!!")}
                }



            }
        }

}

