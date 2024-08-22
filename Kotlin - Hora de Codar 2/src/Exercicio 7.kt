fun main(){

    var soma = 0

    println("Digite um valor: ")
    var n1 = readln().toInt()

    println("Digite um valor: ")
    var n2 = readln().toInt()

    println("Digite um valor: ")
    var n3 = readln().toInt()

    println("Digite um valor: ")
    var n4 = readln().toInt()

    println("Digite um valor: ")
    var n5 = readln().toInt()

    println("Digite um valor: ")
    var n6 = readln().toInt()

    if(n1 < 72){
        soma = soma + n1
    }

    if(n2 < 72){
        soma = soma + n2
    }

    if(n3 < 72){
        soma = soma + n3
    }

    if(n4 < 72){
        soma = soma + n4
    }

    if(n5 < 72){
        soma = soma + n5
    }

    if(n6 < 72){
        soma = soma + n6
    }

    println("Os números digitados são: $n1, $n2, $n3, $n4, $n5 e $n6 e a soma dos números menores que 72 é: $soma")

    }

