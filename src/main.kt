fun main() {
    print("Enter a exp: ")
    val experience = readlnOrNull()?.toIntOrNull() ?: "You should enter a number"

    println(getDeveloperPosition(experience.toString().toInt()))

}


fun getDeveloperPosition(exp: Int): String {
    return when(exp){
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
