fun main(args: Array<String>) {
    print("Digite o custo de fábrica do veículo: ")
    val custoDeFabrica = readLine()!!.toDouble()
    println("\nO Carro novo custa: ${custoFinal(custoDeFabrica)}")
}

fun custoFinal(custoDeFabrica: Double): Double {
    val impostos = custoDeFabrica*0.45
    val porcentagemDistribuidor = custoDeFabrica*0.28
    return custoDeFabrica+impostos+porcentagemDistribuidor
}