
fun main (args:Array<String>){
    val str = "olly olly in come free free"
    countNumberString(str)
}

fun countNumberString(str: String) {

        val splittedString = str.trim().splitToSequence(' ')
            .filter{it.isNotEmpty()}.toList()
         println(splittedString)
//    val stringLength = splittedString.size

     println(splittedString.groupBy { it }
         .mapValues { it.value.count() })

//    OR
    print("olly : \t")
    println(splittedString.filter {it == "olly"}. count ())

    print("in : \t")
    println(splittedString.filter {it == "in"}. count ())

    print("come : \t")
    println(splittedString.filter {it == "come"}. count ())

    print("free : \t")
    println(splittedString.filter {it == "free"}. count ())
}
