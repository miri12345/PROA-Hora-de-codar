fun main(){

    var valor_intervalo = 0
    var soma = 0



    println(("Digite um número: "))
    var n1 = readln().toInt()

    println("Digite outro número (maior que o primeiro): ")
    var n2 = readln().toInt()

    valor_intervalo = n2 - n1 + 1

    while(n1 <= n2){
        soma = soma + n1
        n1 = n1 + 1
    }

    var media = soma / valor_intervalo

   println("A média geral é: $media")

}