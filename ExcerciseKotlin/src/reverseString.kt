
var reverseString = ""
fun main(args:Array<String>){
    println("Enter the string : ")
    var str = readLine()!!.toString()   //Input from console
    println(reverseString(str))
    println(reverseString1("Ahold"))
}

fun reverseString(str: String):String{

    if (str.length == 1) {
        return str
    }
    else
    {
     reverseString = reverseString + str[str.length-1] + reverseString(str.substring(0,str.length-1))
        return reverseString
    }
}

fun reverseString1(str: String) : String {
    var reverse = ""
    for (x in str.length - 1 downTo 0) {
        reverse = reverse + str[x]
    }
    return reverse
}