fun main() {
    print("Enter a exp: ")
    val experience = readlnOrNull()?.toIntOrNull() ?: "You should enter a number"

    println(getDeveloperPosition(experience.toString().toInt()))

    whenWithNoConditions(-1)
    whenWithNoConditions(3)
    whenWithNoConditions(2)

}


fun getDeveloperPosition(exp: Int): String {
    return when(exp){
        in Int.MIN_VALUE..-1 -> "NO WAY!"
        0 -> "intern"
        in 1..2 -> "junior"
        in 3..4 -> "middle"
        in 5..6 -> "senior"
        else -> "leading"
    }
}

fun getUserAccess(isAuthorized: Boolean, role: String): String {
    return when {
        !isAuthorized -> "Restricted"
        role == "Admin" -> "Full"
        role == "Moderator" -> "Limited"
        else -> "Common"
    }
}

fun whenWithNoConditions(someNum: Int): String {
    return when {
        someNum < 0 -> "Нет!"
        someNum == 0 -> "Да!"
        someNum != 0 -> "Больше чем да!"
        else -> "Иной нет!"
    }
}