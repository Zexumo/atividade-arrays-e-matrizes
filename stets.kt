fun main (){
    println("inversao do vetor")
    val vetor = intArrayOf(10,20,30,40,50,60)
    println("original : ${vetor.contentToString()}")

    var inicio = 0
    var fim = vetor.size - 1

    while (inicio < fim) {
        val temp = vetor[inicio]
        vetor[fim] = temp
    }
}