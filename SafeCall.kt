fun main()
{
    val str: String? = "hello"

    //safe call - not null -> length or null
    println("name is ${str?.length}")
    
    //let - executes only if not null
    str?.let {
        println("name is ${str.length}")
    }

    //elvis operator
    val l = str?.length ?: -1
    println(l)

    //non-null assertion - only when we are sure it is not null
    println("name is ${str!!.length}")

}