import java.math.BigInteger

fun main()
{
    println(rec(100, BigInteger("1"), BigInteger("0")))
    println(rec(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun rec(n: Int, a:BigInteger, b:BigInteger) :BigInteger
{
    if(n==0)
        return b
    else
        return rec(n-1, a+b ,a)
}