class `T3-vehiculo`(
    var color: String,
    var marca: String,
    var modelo: String,
    var placas: String,
    var encendido: Boolean,
    var gasolina: Double)
    {
        fun imprimir() {
            println("Atributos del vehiculo: ")
            println(color)
            println(marca)
            println(modelo)
            println(placas)
        }

        fun encender() {
        if (!encendido) {
            encendido = true
            println("El vehículo ha sido encendido.")
        } else {
            println("El vehículo ya está encendido.")
        }
    }

    fun apagar() {
        if (encendido) {
            encendido = false
            println("El vehículo ha sido apagado.")
        } else {
            println("El vehículo ya está apagado.")
        }
    }

    fun recargar(litros: Double) {
        gasolina += litros
        println("Se han recargado $litros litros de gasolina.")
    }

    fun mostrarEstado() {
        val estado = if (encendido) "Encendido" else "Apagado"
        println("Estado del vehículo: $estado")
        println("Nivel de gasolina: $gasolina litros")
    }
}
