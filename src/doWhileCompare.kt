fun main() {
    doWhileFun(100)
    whileFun(100)
}

fun whileFun(sumOuter: Int) {
    var count = 0
    var sum = sumOuter
    println("Enter a start number")
    var n = readlnOrNull()?.toIntOrNull() ?: return
    while (sum < 100) {
        println("current number: $n")
        sum += n
        println("Sum - $sum")
        n++
        count++
    }
    println("Number count - $count")
}

fun doWhileFun(sumOuter: Int) {
    var count = 0
    var sum = sumOuter
    print("Enter a start number: ")
    var n = readlnOrNull()?.toIntOrNull() ?: return
    do {
        println("current number: $n")
        sum += n
        println("sum - $sum")
        n++
        count++
    } while (sum < 100)
    println("Number count - $count")
}