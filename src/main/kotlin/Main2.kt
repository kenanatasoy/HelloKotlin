fun main(){
    val list = listOf("Kotlin", "Java", "C++", "JavaScript", null, null)
    val map = list
        .filterNotNull()
        .associate { it to it.length }

    val language = list.filterNotNull()
        .findLast{ it.startsWith("jf")}.orEmpty()
    println(language)

}