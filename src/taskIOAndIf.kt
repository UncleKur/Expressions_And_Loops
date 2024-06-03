import kotlin.math.roundToInt

fun main() {
    print("Введите длину первой стороны:\t")
    val a = readlnOrNull()?.toDouble() ?: 0.0
    print("Введите длину второй стороны:\t")
    val b = readlnOrNull()?.toDouble() ?: 0.0
    print("Введите длину третьей стороны:\t")
    val c = readlnOrNull()?.toDouble() ?: 0.0
    print("Введите длину четвертой стороны:\t")
    val d = readlnOrNull()?.toDouble() ?: 0.0
    calcFenceMaterials(a, b, c, d)
}

fun calcFenceMaterials(a: Double, b: Double, c: Double, d: Double) {

    val minSide = 2
    val maxSide = 300
    val polesGap = 2.5 //расстояние между столбами
    val listWidth = 1.15 //ширина профлиста

    if (a < minSide || b < minSide || c < minSide || d < minSide) {
        println("Стороны участков должны быть не менее $minSide метров")
        return
    }

    if (a > maxSide || b > maxSide || c > maxSide || d > maxSide) {
        println("Стороны участков не должны быть более $maxSide метров")
        return
    }

    val perimeter = a + b + c + d
    val polesAmount = ((perimeter / polesGap) + (perimeter / polesGap) * 0.1).roundToInt()
    val fenceListAmount = ((perimeter / listWidth) + (perimeter / listWidth) * 0.15).roundToInt()
    println("Необходимое количество столбов: $polesAmount")
    println("Необходимое количество листов профнастила: $fenceListAmount")

}