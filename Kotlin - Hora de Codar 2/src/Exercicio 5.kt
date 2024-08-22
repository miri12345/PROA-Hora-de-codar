fun main(){
    var contador = 0
    var soma = 0
    var media = 0



    while(contador < 6){
        println("Digite um número: ")
        var numero = readln().toInt()

        soma = soma + numero

        contador = contador + 1


        if(contador == 6){
            media = soma / contador
        }

    }
    println("A média dos seis números é: $media")
}