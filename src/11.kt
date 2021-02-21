fun main(args: Array<String>) {
    try {
        print("Digite o valor da Nota 1: ")
        val n1 = readLine()!!.toDouble()
        print("Digite o valor da Nota 2: ")
        val n2 = readLine()!!.toDouble()
        print("Digite o valor da Nota 3: ")
        val n3 = readLine()!!.toDouble()
        println("Média final é ${media(n1, n2, n3)}")

    } catch(e: NumberFormatException) {
        println("Valor digitado não é um valor numérico!")
    }
}

fun media(n1: Double, n2: Double, n3: Double): Double{
    val pesoN1 = 2
    val pesoN2 = 3
    val peso3 = 5

    val media = ((n1*pesoN1)+(n2*pesoN2)+n3+peso3)/10
    return media
}