fun main() {
    var soma = 0

    println("Digite o primeiro número: ")
    var n1 = readln().toInt()

    println("Digite o segundo número: ")
    var n2 = readln().toInt()

    println("Digite o terceiro número: ")
    var n3 = readln().toInt()

    if (n1 > n2 && n1 > n3) {
        if (n2 > n3) {
            soma = n1 + n2
        }
    } else if (n2 > n1 && n2 > n3) {
        if (n1 > n3) {
            soma = n2 + n1
        }
    } else {
        soma = n2 + n3
    }
    if (n3 > n1 && n3 > n2) {
        if (n2 > n1) {
            soma = n3 + n2
        } else {
            soma = n3 + n1
        }
    }

    println("A soma dos maiores números é: $soma")
}

