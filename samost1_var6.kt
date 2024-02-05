fun main(){
    print("x:")
    var x = readLine()!!.toDouble()
    var res: Double
    when{
        (x<=2)->{res = (x*x)+(4*x)+5; println("F(x) $res" )}
        (x>2)->{res = 1/(x*x+4*x+5); println("F(x) $res" ) }
    }
}