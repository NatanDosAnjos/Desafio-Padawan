fun main(args: Array<String>) {
    try {
        print("Digite o salário atual mensal: ")
        val salarioAtual = readLine()!!.toDouble()
        print("Digite a porcentagem do reajuste: ")
        val reajuste = readLine()!!.toDouble()

        println("Valor do salário reajustado é ${reajusteSalarial(salarioAtual, reajuste)}")
    }
    catch(e: NumberFormatException) {
        println("Valor digitado não está no formato numérico!")
    }
}

fun reajusteSalarial(salarioAtual: Double, reajuste: Double): Double {
    return salarioAtual+(salarioAtual*(reajuste/100))
}