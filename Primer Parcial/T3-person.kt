class `T3-person`(
    val nombre: String,
    val apellidos: String,
    val sexo: String,
    val altura: Double) {

    fun presentar(){
        println("\nMe llamo $nombre $apellidos y me soy $sexo, mido $altura")
    }
}