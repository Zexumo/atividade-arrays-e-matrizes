fun main() {
    val matriz = arrayOf(
        intArrayOf(5, 2, 7, 1),
        intArrayOf(3, 8, 4, 6),
        intArrayOf(9, 0, 2, 5),
        intArrayOf(4, 1, 7, 3)
    )

    var somaDiagonal = 0

    println("Matriz 4x4:")
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("%4d".format(matriz[i][j]))
            if (i == j) {
                somaDiagonal += matriz[i][j]
            }
        }
        println()
    }

    println("\nSoma da Diagonal Principal: $somaDiagonal")
}
