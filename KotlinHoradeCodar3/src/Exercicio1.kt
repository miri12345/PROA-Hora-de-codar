fun main() {

    println("Digite um número: ")
    val n1 = readln().toInt()

    println("Digite outro número: ")
    var n2 = readln().toInt()

    while (n2 <= 0 ){
        println("Números menores e iguais a zero não são válidos! Tente novamente")
        n2 = readln().toInt()
    }
    if(n2 > 0) {
       val resultado = n1 / n2
        println("O resultado da divisão é: $resultado")
    }
}