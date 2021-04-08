class Equality
{
    val a :Int = 10
}
fun main()
{
    var o = Equality()
    val o1 = Equality()

    println(o == o1)
    println(o === o1)

    o = o1
    println(o == o1)
    println(o === o1)
}