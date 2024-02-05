fun main(){
    println("Введите возраст:")
    var age = readLine()!!.toInt()
    when(age){
        in 0..2 -> println("Младенец")
        in 3..12 -> println("Ребенок")
        in 13..18 -> println("Подросток")
        in 19..100 -> println("Взрослый")
    }
}