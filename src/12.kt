fun main(args: Array<String>) {
    print("Digite um número qualquer: ")
    try {
        val number = readLine()?.toDouble()
        println("O número digitado foi $number")
    } catch (e: NumberFormatException) {
        println("O que você digitou não é um número!")
    }
}