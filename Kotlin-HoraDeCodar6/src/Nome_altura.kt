data class Pessoa(val nome: String, val altura: Double)

fun main() {
    val pessoas = mutableListOf<Pessoa>()

    while (true) {
        println("\nMenu:")
        println("1. Cadastrar as 15 pessoas")
        println("2. Exibir pessoas com altura menor ou igual a 1.5m")
        println("3. Exibir pessoas com altura maior que 1.5m")
        println("4. Exibir pessoas com altura maior que 1.5m e menor que 2.0m")
        println("5. Calcular e exibir a média das alturas")
        println("6. Sair")
        print("Escolha uma opção: ")
        val opcao = readln().toInt()

        when (opcao) {
            1 -> {
                cadastrarPessoas(pessoas)
            }
            2 -> {
                exibirMenoresOuIguais(pessoas)
            }
            3 -> {
                exibirMaiores(pessoas)
            }
            4 -> {
                exibirEntre(pessoas)
            }
            5 -> {
                calcularMediaAlturas(pessoas)
            }
            6 -> {
                println("Saindo do programa.")
                break
            }
            else -> {
                println("Opção inválida, tente novamente.")
            }
        }
    }
}

fun cadastrarPessoas(pessoas: MutableList<Pessoa>) {
    for (i in 1..15) {
        print("Digite o nome da pessoa $i: ")
        val nome = readln()
        print("Digite a altura de $nome: ")
        val altura = readln().toDouble()
        pessoas.add(Pessoa(nome, altura))
    }
}

fun exibirMenoresOuIguais(pessoas: List<Pessoa>) {
    println("\nPessoas com altura menor ou igual a 1.5m:")
    for (pessoa in pessoas) {
        if (pessoa.altura <= 1.5) {
            println("${pessoa.nome} - ${pessoa.altura}m")
        }
    }
}

fun exibirMaiores(pessoas: List<Pessoa>) {
    println("\nPessoas com altura maior que 1.5m:")
    for (pessoa in pessoas) {
        if (pessoa.altura > 1.5) {
            println("${pessoa.nome} - ${pessoa.altura}m")
        }
    }
}

fun exibirEntre(pessoas: List<Pessoa>) {
    println("\nPessoas com altura entre 1.5m e 2.0m:")
    for (pessoa in pessoas) {
        if (pessoa.altura > 1.5 && pessoa.altura < 2.0) {
            println("${pessoa.nome} - ${pessoa.altura}m")
        }
    }
}

fun calcularMediaAlturas(pessoas: List<Pessoa>) {
    val somaAlturas = pessoas.sumOf { it.altura }
    val mediaAlturas = somaAlturas / pessoas.size
    println("\nA média das alturas é: ${"%.2f".format(mediaAlturas)}m")
}
