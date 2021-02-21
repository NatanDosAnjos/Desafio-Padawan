fun main(args: Array<String>) {
    println("Digite um valor numérico Inteiro")
    try {
        var value = readLine()?.toInt()
        println("O antecessor do valor digitado é: ${value?.minus(1)}")

    }
    catch(e: NumberFormatException) {
        println("Valor digitado não é numérico")
    }
}