fun main() {
    println("Введите первое число ")
    var num1 = readLine()!!.toInt()
    println("Введите второе число ")
    var num2 = readLine()!!.toInt()
    when{
        (num1==num2)->  {
       println(num1*num1*num1)}
        (num1>num2)-> {
            println(num1+1)}
        (num2>num1)-> {
            println(num2+1)}
        else -> println("Ошибка")
    }
}