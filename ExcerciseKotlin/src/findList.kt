fun main (args: Array<String>){
    val listA = mutableListOf<Int>(1,2,3,4,5)
    val listB = mutableListOf<Int>(4,5)
    recursivecall(listA, listB, 0, listB.size)
}

fun recursivecall(listA: List<Int>,listB: List<Int>,start : Int , end :Int ) {

    var newList = listA.subList(start, end )
    if (newList == listB) {
        println(newList)
        println("B is subset of A")
    }
    else if(end==listA.size){
        println("Nothing matching")
    }
    else
        recursivecall(listA, listB, start+1, end+1)
}

