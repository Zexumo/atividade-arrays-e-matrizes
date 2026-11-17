fun main() {
    val notas = Array(3) { DoubleArray(2) }
    val nomes = arrayOf("Ana", "Bruno", "Carla")

    // Atribuindo notas
    notas[0] = doubleArrayOf(8.0, 7.5)
    notas[1] = doubleArrayOf(6.0, 5.5)
    notas[2] = doubleArrayOf(9.0, 8.5)

    var somaGeral = 0.0

    for (aluno in notas.indices) {
        val media = notas[aluno].average()
        somaGeral += media

        val situacao = if (media >= 7.0) "✅ Aprovado" else "❌ Reprovado"
        println("${nomes[aluno]} — Média: %.1f — $situacao".format(media))
    }

    val mediaTurma = somaGeral / notas.size
    println("\nMédia geral da turma: %.2f".format(mediaTurma))
}
