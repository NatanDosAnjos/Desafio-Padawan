fun main(args: Array<String>) {
    print("Digite um valor em Metros para ser convertido em Centímetros: ")
    try {
        val m = readLine()!!.toDouble()
        println("${convertMToCm(m)}cm")

    } catch (e: NumberFormatException) {
        println("Valor Digitado não é um número!")
    }
}

fun convertMToCm(m: Double): Int {
    return (m*100).toInt()
}