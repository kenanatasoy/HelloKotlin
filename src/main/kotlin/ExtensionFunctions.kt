
fun main(){

    val arr : Array<Any> = arrayOf("a", "b", "c", "d", "e")

    arr.ourVersionReverse(4)

    println(arr.contentToString())

    // or

    for (eachElement in arr){
        print("$eachElement ")
    }

    println()

}


fun <T> Array<T>.ourVersionReverse(fromIndex: Int = 0) {
    checkRangeIndexes(fromIndex, size)
    val midPoint = (fromIndex + size) / 2
    if (fromIndex == midPoint) return
    var reverseIndex = size - 1
    for (index in fromIndex until midPoint) {
        val tmp = this[index]
        this[index] = this[reverseIndex]
        this[reverseIndex] = tmp
        reverseIndex--
    }
}


fun checkRangeIndexes(fromIndex: Int, size: Int) {
    if (fromIndex < 0) {
        throw IndexOutOfBoundsException("fromIndex: $fromIndex, size: $size")
    }
    if (fromIndex >= size) {
        throw IndexOutOfBoundsException("fromIndex: $fromIndex >= size: $size")
    }
}


