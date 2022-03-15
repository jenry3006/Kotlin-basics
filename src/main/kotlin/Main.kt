import kotlin.contracts.ReturnsNotNull

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {

    var neverNull: String = "Isso não pode ser null"
    neverNull = null

    var nullable: String? = "voce pode ter um valor null aqui"
    nullable = null

    var inferredNonNull = "o compilador assume q não seja null "
    inferredNonNull = null

    fun strLength(notNull: String) : Int{
        return notNull.length;
    }

    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))


}



