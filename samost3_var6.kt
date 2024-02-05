fun main(){
    print("Введите денежные накопления сестры 1")
    var sist1 = readLine()!!.toDouble()
    print("Введите денежные накопления сестры 2")
    var sist2 = readLine()!!.toDouble()
    var res: Double
    when{
        (sist1>sist2)-> {res = sist1-sist2; println("Сестра 1 должна отдать $res, чтобы суммы были равными")}
        (sist2>sist1)-> {res = sist2-sist1; println("Сестра 2 должна отдать $res, чтобы суммы были равными")}
        (sist1==sist2)->{print("У обеих сестер равные суммы")}
    }

}