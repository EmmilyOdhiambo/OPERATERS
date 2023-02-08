fun main(){
   var name = "Stephanie"
    println("Hello" +name)
    remainder(30,40)
    addition(66,79)
    addition(56,74)
    addition(40,68)
    addition(90,79)

    AboutMe("Stephanie,IamPerfect")
}
fun remainder(num1:Int,num2:Int){
    var result = (num1 % num2)
    println(result)

}
fun addition(num1:Int,num2:Int){
    var sum = (num1 + num2)
    println(sum)
}
fun AboutMe(name:String){
    var status=("Stephanie,IamPerfect")
    println(status)
}



