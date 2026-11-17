fun main() {
    val matriz = arrayOf(
        intArrayOf(5, 0, 8),
        intArrayOf(0, 3, 2),
        intArrayOf(7, 0, 4)
    )

    var soma = 0

    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            val valor = matriz[i][j]

            if (valor == 0) {
                continue // Pula para a próxima repetição
            }

            soma += valor
        }
    }

    println("Soma dos valores maiores que zero: $soma")
}
