
fun main(args:Array<String>)
{
    println("Enter the number : ")
    var year = readLine()!!.toInt()   //Input from console
    println(leapYear(year))

    //Leap Years - 2004, 2000, 1992, 2020 Not leap years - 3000, 2002, 2021
}

fun leapYear(year : Int): String{
    if(year % 400 == 0)
        return "The year $year is a leap year"
    else if(year % 4 == 0 && !(year % 100 == 0 ))
        return "The year $year is a leap year"
    else
        return "The year $year is not leap year"
}