fun main(){

    var notas = 1
    var soma = 0.0


    while (notas <= 6) {
        println("Digite a nota $notas :")
        val nota = readln().toDouble()


        if(nota >= 0 && nota <= 10) {
            soma = soma + nota
            notas = notas + 1
        }else {
            println("Nota inválida! Digite um valor entre 0 e 10.")
        }
    }


    var media = soma / 6


    println("A média das notas é: $media")
}