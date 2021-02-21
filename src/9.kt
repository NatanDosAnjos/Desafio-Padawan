fun main(args: Array<String>) {
    try {
        print("Digite quantos carros foram vendidos por fulano: ")
        val numDeCarros = readLine()!!.toInt()

        print("Digite o valor total das vendas de fulano: ")
        val valorTotalDeVendas = readLine()!!.toDouble()

        print("Digite o salário do funcionário: ")
        val salarioFixo = readLine()!!.toDouble()

        print("Digite o valor da comissão em porcentagem APENAS NÚMEROS: ")
        val comissaoPorCarro = readLine()!!.toDouble()

        var total = salarioFinal(salarioFixo, numDeCarros, valorTotalDeVendas, comissaoPorCarro)
        println("O salário total de fulano é $total")
        
    }
    catch(e: NumberFormatException) {
        println("Valor digitado não é numérico!")
    }
}

fun salarioFinal(salarioFixo: Double, numDeCarros: Int, valorTotalDeVendas: Double, comissaoPorCarro: Double): Double {
    return salarioFixo+(numDeCarros*(comissaoPorCarro/100))+(valorTotalDeVendas*0.05)
}