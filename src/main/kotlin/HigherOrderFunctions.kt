fun printFilteredStrings(list: List<String>,
                         predicate: ((String) -> Boolean)?){
    list.forEach {
        if(predicate?.invoke(it) == true){
            println(it)
        }
    }
}

val predicate1: (String) -> Boolean = {
    it.startsWith("J")
} // functional type

fun getPrintPredicate(string: String): (String) -> Boolean {
    return { it.startsWith(string) }
} // higher order function

fun main(){

    val list = listOf("Kotlin", "Java", "C++", "JavaScript")
    printFilteredStrings(list, getPrintPredicate("K"))

    printFilteredStrings(list, null)
}