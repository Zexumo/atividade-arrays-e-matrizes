fun main() {
    val codigos = arrayOf("TX001", "TX002", "TX003", "TX004", "TX005")
    val codigoBuscado = "TX003"

    for (indice in codigos.indices) {
        if (codigos[indice] == codigoBuscado) {
            println("Código $codigoBuscado encontrado na posição: $indice")
            break // Interrompe imediatamente
        }
    }
}
