interface HigherOrder {
    fun add(sum: Int)
}

class High {
    fun sum(a:Int,b:Int, x:HigherOrder)
    {
        val sum = a+b
        x.add(sum)
    }

    fun sum1(a:Int,b:Int, x:(Int) -> Unit)
    {
        val sum = a+b
        x(sum)
    }
}
fun main()
{
    val o = High()
    o.sum(2,4,object : HigherOrder
    {
        override fun add(sum: Int) {
            println(sum)
        }

    })
    val total: (Int) -> Unit = { t -> println(t)}

    o.sum1(5,6,total)
}