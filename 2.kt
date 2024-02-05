fun main(){
    println("Введите цифру от 0 до 9")
   var num = readLine()!!.toInt()
    when{
        num==0-> println("Ноль")
        num==1-> println("Один")
        num==2-> println("Два")
        num==3-> println("Три")
        num==4-> println("Четыре")
        num==5-> println("Пять")
        num==6-> println("Шесть")
        num==7-> println("Семь")
        num==8-> println("Восемь")
        num==9-> println("Девять")
        else-> println("Введите цифру от 0 до 9!")
    }
}