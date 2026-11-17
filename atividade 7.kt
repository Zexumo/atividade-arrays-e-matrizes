fun main() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val linhas = original.size
    val colunas = original[0].size

    // Matriz transposta: colunas viram linhas
    val transposta = Array(colunas) { IntArray(linhas) }

    for (i in 0 until linhas) {
        for (j in 0 until colunas) {
            transposta[j][i] = original[i][j]
        }
    }

    println("Matriz Original (2x3):")
    for (linha in original) println(linha.contentToString())

    println("\nMatriz Transposta (3x2):")
    for (linha in transposta) println(linha.contentToString())
}
