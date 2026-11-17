fun main() {
    val temperaturas = doubleArrayOf(25.5, 27.0, 24.0, 29.5, 26.0, 23.5, 28.0)
    val dias = arrayOf("Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo")

    // Cálculo da média
    var soma = 0.0
    for (temp in temperaturas) {
        soma += temp
    }
    val media = soma / temperaturas.size
    println("Temperatura média: %.2f°C".format(media))

    // Mostra os dias acima da média
    println("\nDias com temperatura ACIMA da média:")
    for (indice in temperaturas.indices) {
        if (temperaturas[indice] > media) {
            println("${dias[indice]} (índice $indice): %.1f°C".format(temperaturas[indice]))
        }
    }
}
