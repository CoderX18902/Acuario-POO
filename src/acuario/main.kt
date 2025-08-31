package acuario

fun construirAcuario() {
    val acuario1 = Acuario()
    acuario1.imprimirTamano()

    val acuario2 = Acuario(ancho = 25)
    acuario2.imprimirTamano()
}

fun crearPeces() {
    val miTiburon = Tiburon()
    val miPezPayaso = PezPayaso()

    println("Color del tiburón: ${miTiburon.color}")
    println("Color del pez payaso: ${miPezPayaso.color}")

    miTiburon.comer()
    miPezPayaso.comer()
}

fun main() {
    construirAcuario()
    crearPeces()
}