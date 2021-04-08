class Apply
{
    var name: String = ""
    var id: Int = 0
    fun show(name: String,id:Int)
    {
        println("$name and $id")
    }
}

fun main()
{
    var o = Apply()

    with(o)
    {
        name = "alice"
        id = 101
    }

    o.apply {
        name = "bob"
        id = 108
    }.show(o.name,o.id)
}