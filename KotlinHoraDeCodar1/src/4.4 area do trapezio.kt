fun main() {
    println("Informe o valor da base maior: ")
    val diagonalMaior = readln().toDouble()

    println("Informe o valor da base menor: ")
    val diagonalMenor = readln().toDouble()

    println("Informe o valor da altura: ")
    val altura = readln().toDouble()

    val area = diagonalMaior * diagonalMenor * altura / 2

    println("O valor da área é: $area")
}