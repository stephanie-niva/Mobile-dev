fun main(){
    printName("Stephanie")
    modulus(10,3)
    add(10,20,30.55,40.45)
    printInterest("I love trying new recipies")

}
fun printName(name: String){
    println("Hello"+ " "+ name)
}
fun modulus(num1:Int , num2:Int){
    var result= num1%num2
    println(result)

}
fun add(x:Int, y:Int, a:Double, b:Double){
    var sum= x+y+a+b
    println(sum)

}
fun printInterest(interest: String){
    println(interest)
}
