fun main(){
   var maior = 0

    println("Digite o primeiro valor: ")
    var n1 = readln().toInt()

    println("Digite o segundo valor: ")
    var n2 = readln().toInt()

    println("Digite o terceiro valor: ")
    var n3 = readln().toInt()

    println("Digite o quarto valor: ")
    var n4 = readln().toInt()

    maior = n1

    if(n2 > maior) {
        maior = n2
    }
    if(n3 > maior){
        maior = n3
    }
    if(n4 > maior){
        n4 = maior
    }
println("O primeiro valor é: $n1, o último valor é: $n2 e maior valor é: $maior")

}