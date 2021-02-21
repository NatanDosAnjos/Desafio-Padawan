import java.util.Date
import java.text.SimpleDateFormat
import java.text.ParseException
import java.util.Calendar
import java.util.GregorianCalendar

fun main(args: Array<String>) {
    println("Digite sua data de nascimento no formato dd/mm/aaaa - Ex: 27/07/1997")
    val birthDate = readLine()!!
    if(isValidDate(birthDate)) {
        val daysOfLife = countDays(birthDate)
        if(daysOfLife > 0 ) { 
            println("Você tem $daysOfLife dias de vida")
        } else {
            println("Desculpe mas você não nasceu ainda, verifique se a data digitada está correta")
        }
    } else {
        println("Data digitada é inválida")
    }
}

fun countDays(birthDateString: String): Int {
    val currentDate = GregorianCalendar()
    val year = currentDate.get(Calendar.YEAR)
    val month = currentDate.get(Calendar.MONTH)+1 //Necessário adicionar 1 pois os meses são da biblioteca são contados de 0 até 11
    val day = currentDate.get(Calendar.DAY_OF_MONTH)


    val numbers = birthDateString.split("/")
    if(numbers.size == 3) {
        val birthDay = numbers[0].toInt()
        val birthMonth = numbers[1].toInt()
        val birthYear = numbers[2].toInt()

        var daysDifferenceInMonth = differenceBetweenTwoNumbers(day, birthDay)
        var monthDifferenceInYear = differenceBetweenTwoNumbers(month, birthMonth)
        var yearsDifference = differenceBetweenTwoNumbers(year, birthYear)

        if(birthMonth > month && birthDay > day && birthYear >= year) {
            return 0

        } else if (birthMonth == month && birthYear == year) {
            return ((yearsDifference*365)+(monthDifferenceInYear*30))+daysDifferenceInMonth+1

        } else if (birthYear <= year) {
            if(birthMonth >= month) {
                if(yearsDifference > 0) {
                    yearsDifference --
                }
                val monthTo = 12 - monthDifferenceInYear
                return ((yearsDifference*365)+(monthTo*30))+daysDifferenceInMonth+1
            }
        }
        return ((yearsDifference*365)+(monthDifferenceInYear*30))+daysDifferenceInMonth+1
    }
    return 0
}


/*--------------------------------------------Support Functions--------------------------------------*/
fun differenceBetweenTwoNumbers(n1: Int, n2: Int): Int {
    return if(n1 > n2) {
        n1 - n2
    } else {
        n2 - n1
    }
}

fun isValidDate(dateString: String): Boolean {
    try {
        val date = SimpleDateFormat("dd/MM/yyyy").let{
            it.setLenient(false)
            it.parse(dateString)
        }
        return true
    } catch (e: ParseException) {
        return false
    }
}