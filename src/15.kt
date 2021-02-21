fun main(args: Array<String>) {
    print("Digite o RAIO do círculo: ")

    try {
        val radius = readLine()!!.toInt()
        println("A área do circulo é ${circleArea(radius)}")
    }
    catch(e: NumberFormatException) {
        println("Valor digitado não é numérico!")
    }
}

fun circleArea(radius: Int): Double {
    return Math.PI*(radius*radius)
}