fun List<String>.reverseList(): List<String> {
    return(this.asReversed())
}

fun main(args: Array<String>) {
    val defaultList = listOf("Artur", "Bill", "Charlote", "Dean", "Eric")
    
    println(defaultList.reverseList());
}