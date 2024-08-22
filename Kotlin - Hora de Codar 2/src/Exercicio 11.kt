
    fun main() {


        var resultado = 0.0


        println("Digite dois valores: ")
        var n1 = readln().toDouble()

        println("Digite dois valores: ")
        var n2 = readln().toDouble()


        println("Qual operação você deseja? Sendo adição (1), subtração (2), divisão (3) e multiplicação (4): ")
        val operacao = readln().toInt()


        if (operacao == 1) {
            resultado = n1 + n2
            println("O valor da adição é: $resultado")
        }
        else if (operacao == 2) {
            resultado = n1 - n2
            println("O valor da subtração é: $resultado")
        }
        else if (operacao == 3) {

                resultado = n1 / n2
                println("O valor da divisão é: $resultado")

        }
        else if (operacao == 4) {
            resultado = n1 * n2
            println("O valor da multiplicação é: $resultado")
        }else{
            println("Digite um valor de operação válido!")
        }
    }
