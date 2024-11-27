fun main(){

    var soma = 0.0
    var valor = 0.0
    var media = 0.0

    println("Informe a primeira nota: ")
    var nota1 = readln().toDouble()

    println("Informe a segunda nota: ")
    var nota2 = readln().toDouble()

    println("Informe a terceira nota: ")
    var nota3 = readln().toDouble()

    println("Informe a quarta nota: ")
    var nota4 = readln().toDouble()

    if(nota1 > 0 && nota1 < 10){
        valor = valor + 1
        soma = soma + nota1
    }

    if(nota2 > 0 && nota2 < 10){
        valor = valor + 1
        soma = soma + nota2
    }

    if(nota3 > 0 && nota3 < 10){
        valor = valor + 1
        soma = soma + nota3
    }

    if(nota4 > 0 && nota4 < 10){
        valor = valor + 1
        soma = soma + nota4
    }

   media = soma / valor

    if(media > 5){
        println("Você passou no teste")
    } else{
        println("Tente novamente!")
    }
 println("Sua média foi: $media \n")
}