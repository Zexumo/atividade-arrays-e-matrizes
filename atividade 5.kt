fun main() {
    val tarefas = arrayOf("Estudar Kotlin", "Fazer exercícios", "Revisar conteúdo", "Descansar")

    for ((indice, descricao) in tarefas.withIndex()) {
        val numeroOrdem = indice + 1 // começa em 1
        println("$numeroOrdem. $descricao")
    }
}
