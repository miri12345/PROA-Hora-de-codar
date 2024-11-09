fun main() {
    println("Informe o valor do diagonal maior: ")
    val diagonalMaior = readln().toDouble()

    println("Informe o valor do diagonal menor: ")
    val diagonalMenor = readln().toDouble()

    val area = diagonalMaior * diagonalMenor / 2

    println("O valor da área é: $area")
}