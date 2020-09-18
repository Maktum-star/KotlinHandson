package KotlinSamples.Quantifiers

fun main(args: Array<String>)
{
    val numbers = arrayOf(1,2,3,4,5).asSequence()
    println("Are all numbers > 0? ${numbers.all{it>0}}")
    println("Are all numbers odd? ${numbers.all{it%2==1}}")
    println("Any number > 1? ${numbers.any{it>1}}")
    println(emptyArray<Int>().any())

    println("Contains 5? ${numbers.contains(5)}")
    println("Number of elements > 3 = ${numbers.count{it>3}}")
    println("Total number of elements = ${numbers.count()}")
}