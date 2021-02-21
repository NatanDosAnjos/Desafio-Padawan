fun main(args: Array<String>) {
    try {
        println("Digite o primeiro número")
        val number1 = readLine()!!.toDouble()
        println("Digite o segundo número")
        val number2 = readLine()!!.toDouble()

        println("A soma de $number1 e $number2 é: ${sum(number1, number2)}")
    }
    catch(e: NumberFormatException) {
        println("Valor digitado não é numérico!")
    }
}

fun sum(num1: Double, num2: Double): Double {
    return num1 + num2
}