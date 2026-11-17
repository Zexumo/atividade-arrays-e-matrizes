fun main() {
    val numeros = IntArray(20) { it + 1 } // 1, 2, 3 ... 20
    var soma = 0

    // step 2 → índices 0, 2, 4, 6...
    for (indice in 0 until numeros.size step 2) {
        soma += numeros[indice]
    }

    println("Array: ${numeros.contentToString()}")
    println("Soma dos valores em índices pares: $soma")
}
