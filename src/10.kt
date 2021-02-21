fun main(args: Array<String>) {
    var temp: Double = 0.0
    readLine()!!.let{
        try {
            temp = it.toDouble()
            println("%.1f C°".format(fahrenheitToCelsius(temp)))

        } catch (e: NumberFormatException) {
            println("Valor passado não é um número")
        }
    }
}

fun fahrenheitToCelsius(temp: Double): Double {
    return ((temp-32)/9)*5
}
