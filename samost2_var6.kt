fun main(){
    print("Введите четырехзначное число: ")
    var num = readLine()!!.toInt()
    var number1: Int; var number2: Int
    number1=num/1000+(num/100)%10
    number2=(num/10)%10+num%10

    when{
        (number1==number2)-> println("Сумма двух первых и двух последних цифр числа равна")
        else-> println("Сумма двух первых и двух последних цифр числа НЕ равна")
    }
}