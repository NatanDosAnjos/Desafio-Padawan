fun main(args: Array<String>) {
    try {
        print("Digite o total de eleitores: ")
        val eleitores = readLine()!!.toInt()

        print("Digite a quantidade de votos BRANCOS: ")
        val brancos = readLine()!!.toInt()
        print("Digite a quantidade de votos NULOS: ")
        val nulos = readLine()!!.toInt()
        print("Digite o total de votos VÁLIDOS: ")
        val validos = readLine()!!.toInt()

        println("\nO votos BRANCOS equivalem a %.1f%% dos eleitores".format(percentual(eleitores, brancos)))
        println("O votos NULOS equivalem a %.1f%% dos eleitores".format(percentual(eleitores, nulos)))
        println("O votos INVALIDOS equivalem a %.1f%% dos eleitores".format(percentual(eleitores, validos)))

    } catch (e: NumberFormatException) {
        println("\nValor Digitado não é numérico")
    }
}

fun percentual(totalDeEleitores: Int, valor: Int): Double {
    return (100*valor)/totalDeEleitores.toDouble()
}