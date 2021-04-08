

class NamedParam {

    fun show(length: Int, breadth: Int, height:Int)
    {
        println("length is $length")
        println("breadth is $breadth")
        println("height is $height")
    }
}

fun main()
{
    val o = NamedParam()
    o.show(height = 90, breadth = 85, length = 76)
}