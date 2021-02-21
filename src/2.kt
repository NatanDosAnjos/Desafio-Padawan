fun main(args: Array<String>) {
    var a1 = (4/2)+(2/4)
    var a2 = 4/(2+2)/4
    isTheSame(a1, a2, "A")

    var b1 = 4/(2+2)/4
    var b2 = (4+2)*2-4
    isTheSame(b1, b2, "B")

    var c1 = (4+2)*2-4
    var c2 = 4+2*2-4
    isTheSame(c1, c2, "C")
}

fun isTheSame(first: Int, second: Int, letter: String)  {
    println("$letter = ${if(first == second) true else false}")
}