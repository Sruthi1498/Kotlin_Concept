class Closure{
    fun add(a:Int, b:Int, x: (Int, Int) -> Unit)
    {
        x(a, b)
    }
}

fun main()
{
    val o = Closure()
    var result = 0
    o.add(3,4) {x, y -> result = x + y}
    print(result)
}