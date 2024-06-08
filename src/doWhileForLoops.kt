fun main() {
    whileLoopFunc()
}

fun whileLoopFunc() {
    print("Enter a positive number: ")
    val positiveNumber = readlnOrNull()?.toInt() ?: return
    var i: Int = 0
    var sum = 0

//    while (i <= positiveNumber) {
//        println(i)
//        sum += i
//        i++
//    }

    for(j in 0..positiveNumber) {
        if(j % 2 == 0) continue
        println(j)
        sum += j
    }

    println("Sum of first $positiveNumber number - $sum")
}