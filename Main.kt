
fun main(){
    println("Pon un nombre")
    val opcion:String = readln().lowercase()

    when(opcion){
        "manolo" -> manolo()
        "pepe" -> Pepe()
        "maria" -> Maria()
    }
}

fun manolo(){
    val Manolo = Persona("Manolo",15,"4t A")

    println("Su nombre es ${Manolo.nombre}")
    println("Su edad es ${Manolo.edad}")
    println("Su curso es ${Manolo.curso}")
}

fun Pepe(){
    val Pepe= Persona("Pepe",12 ,"1r A")

    println("Su nombre es ${Pepe.nombre}")
    println("Su edad es ${Pepe.edad}")
    println("Su curso es ${Pepe.curso}")
}

fun Maria(){
    val Maria = Persona("Maria",16,"1r Batchiller B")

    println("Su nombre es ${Maria.nombre}")
    println("Su edad es ${Maria.edad}")
    println("Su curso es ${Maria.curso}")
}