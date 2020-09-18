fun main(args:Array<String>){

    val lambdaFun = LambdaFun()
    val myLambdaadd : (Int, Int) -> Int = {x ,y  -> x+y}
    val myLambdamul : (Int, Int) -> Int = {x, y -> x*y }
    println(lambdaFun.lambdafunctionadd(4,3,myLambdaadd))
    println(lambdaFun.lambdafunctionadd(5,6, myLambdamul))
    lambdaFun.lambdafunctionaddString()
}

class LambdaFun(){

    fun lambdafunctionadd(x:Int, y:Int, action: (Int, Int) -> Int) :Int {
       val result = action(x,y)
        return result
    }

    fun lambdafunctionaddString(){
        val str1 : (String,  String) -> String = {str1, str2 -> str1.plus(str2)}
        println("Final String is ${str1("Hello", "Maktum")}")
    }

}
