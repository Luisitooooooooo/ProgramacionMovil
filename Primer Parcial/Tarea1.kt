const val PI = 3.1416

fun main (){
    val num = 5.123F
    println(num::class.simpleName)

    //Se multiplica PI por el radio para sacar el perimetro
    val perimetro = PI*(num*num)

    //Se crea un String template para imprimir el perimetro
    val message = "El perimetro es: $perimetro"
    println(message)

    //Se resuelve la pendiente para los valores:
    val x1 = 4.0
    val x2 = -3.0
    val y1 = 3.0
    val y2 = -2.0
    //Ecuación de la pendiente
    val pendient: Double = (y2 - y1) / (x2 - x1)
    println("La pendiente es: $pendient")
}
