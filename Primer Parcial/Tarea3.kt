
fun main() {
    val miCoche = `T3-vehiculo`("Blanco", "Hyundai", "Attitude", "ABC123", false, 30.0)

    miCoche.imprimir()
    println("Estado inicial del vehículo:")
    miCoche.mostrarEstado()

    println("\nEncendiendo el vehículo:")
    miCoche.encender()
    miCoche.mostrarEstado()

    println("\nRecargando gasolina:")
    miCoche.recargar(5.0)
    miCoche.mostrarEstado()

    val person = `T3-person`("Juan", "Perez", "hombre", 1.75)
    person.presentar()
}
