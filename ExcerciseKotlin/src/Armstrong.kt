fun main(args:Array<String>){

    println("Enter the number : ")
    var originalNumber = readLine()!!.toInt()  //Reading Input from console
    println("Entered number : $originalNumber ")
    println(Armstrongnumber(originalNumber))

//Armstrong numbers - 9, 153, 1634
}

fun Armstrongnumber(originalNumber: Int): String {

    var replicaNumber: Int
    var remainder: Int
    var result = 0
    val numberList = mutableListOf<Int>()

    replicaNumber = originalNumber
    while(replicaNumber!=0)
    {
        remainder = replicaNumber % 10
        replicaNumber /= 10
        numberList.add(remainder)
    }
    println("Total number of digits in entered number ${numberList.size}")

    replicaNumber = originalNumber
    while(replicaNumber !=0) {
        remainder = replicaNumber % 10
        result += Math.pow(remainder.toDouble(), (numberList.size).toDouble()).toInt()
        replicaNumber = replicaNumber/10
    }

    if (result == originalNumber)
        return ("$originalNumber is an Armstrong number.")
    else
        return ("$originalNumber is not an Armstrong number.")

}