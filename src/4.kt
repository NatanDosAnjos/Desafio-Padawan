fun main(args: Array<String>) {
    var height: Double? = 0.0
    var width: Double? = 0.0

    print("Digite em centímetros a LARGURA: ")
    val widthInStringFormat = readLine()
    print("Digite em centímetros a ALTURA: ")
    val heightInStringFormat = readLine()
   
    try {
       height = heightInStringFormat?.toDouble()
       width = widthInStringFormat?.toDouble()
       println("Área total de ${area(height, width)}")
       
    } catch (e: NumberFormatException) {
        println("Altura ou Largura informados não são digitos numéricos")
    }
}

fun area(height: Double?, width: Double?): String {
    if(height != null && width != null) {

        // Calcula altura * largura e retorna valor em Centímetros
        val areaInCm = height * width

        // Se o valor do cálculo em centímetros for igual ou maior que 1000cm transforma os valores de altura e largura em metros, refaz o calculo e devolve o resultado em Metros
        if(areaInCm > 999) {
            return "${(height/100)*(width/100)}m²"

        // Se o valor for entre de 100cm a 999cm. Divide o resultado por 100 para devolver o valor em metros na escala de 1m até 10m. Mais que 10m o cálculo aplicado deve ser transformar os valores em Metros antes do calculo de área
        } else if(areaInCm > 99 && areaInCm < 1000) {
           return "%.2fm²".format(areaInCm/100)

        // Se o valor for menor que 1m retorna o valor em centímetros
        } else {
            return "%.2fcm²".format(areaInCm)
        }
    } else {
       return "0.0"
    }
}