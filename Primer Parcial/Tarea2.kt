//Funcion main
fun main (){
    val height = 2.0f
    val heightprism = 3.0f
    val base = 5.5f
    val area = areaRectangle(base, height)
    println("--> El área del rectangulo es: $area")
    println("--> El volúmen del prisma rectangular es: ${volPrism(area, heightprism)}")
    println("--> El promedio de las calificaciones es: ${promedio(calif2 = 10f)}")
    println("--> El triangulo es de tipo: ${triangletype(side=1,side1=2,side2=3)}")
    println("--> El tipo de dato es: ${datatype(data="Hola")}")

    val nombres = listOf("Pedro","Luis","Juan","Manuel","Juan","Luis","María","Inés","Romeo",
        "Ernesto","Juan","Pedro","Ariadna","Mireya","María","Ana","Sofía","José","Juan")
    val nombreBuscado = "Juan"
    println(names(nombres,nombreBuscado))
}

//Función para determinar las veces que se repite un nombre en una lista determinada
fun names(nombres:List<String>,nombreBuscado:String): String {
    var counter = 0
    for(nombre in nombres){
        if (nombreBuscado == nombre) {
            counter++
        }
    }
    val times = "--> El nombre Juan se repite: $counter veces"
    return times
}

//Función para determinar el tipo de un dato
fun datatype(data:Any): String {
    when(data){
        is String -> {val types = "Cadena de caracteres"
            return types}
        is Int -> {val types = "Numero entero"
            return types}
        is Float -> {val types = "Flotante"
            return types}
        is Double -> {val types = "Double"
            return types}
        is Boolean -> {val types = "Booleano"
            return types}
        else -> {val types = "Otro"
            return types}
    }
}

//Función para determinar el tipo de un triangulo
fun triangletype(side:Int,side1:Int,side2:Int): String {
    if (side==side1 && side1==side2) {
        val type = "El triangulo es Equilatero."
        return type
    }
    else if(side==side1 || side1==side2 || side2==side) {
        val type = "El triangulo es Isóceles."
        return type
    }
    else{val type = "El triangulo es Escaleno"
        return type
    }
}

//Función para calcular el promedio de 3 calificaciones
fun promedio (calif:Float = 8.0f, calif1:Float = 8.0f, calif2:Float): Float{
    return (calif + calif1 + calif2)/3
}

//Función para calcular el área de un rectangulo
fun areaRectangle (base:Float,height:Float): Float {
    return base*height
}

//Función para calcular el volumen de un prisma
fun volPrism(area:Float,heightprism:Float): Float{
    return area*heightprism
}