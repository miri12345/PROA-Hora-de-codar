data class Funcionario(val matricula: Int, val nome: String, val salario: Double)

fun main() {
    val funcionarios = mutableListOf<Funcionario>()

    while (true) {
        println("\nMenu:")
        println("1. Cadastrar os 20 funcionários e ordenar por matrícula")
        println("2. Pesquisar funcionário pelo número de matrícula")
        println("3. Exibir funcionários com salário acima de R$1000,00 (ordenados por matrícula)")
        println("4. Exibir funcionários com salário abaixo de R$1000,00 (ordenados por matrícula)")
        println("5. Exibir funcionários com salário igual a R$1000,00 (ordenados por matrícula)")
        println("6. Sair do programa")
        print("Escolha uma opção: ")
        val opcao = readln().toInt()

        when (opcao) {
            1 -> {
                cadastrarFuncionarios(funcionarios)
            }
            2 -> {
                pesquisarFuncionario(funcionarios)
            }
            3 -> {
                exibirFuncionariosPorSalario(funcionarios, "acima")
            }
            4 -> {
                exibirFuncionariosPorSalario(funcionarios, "abaixo")
            }
            5 -> {
                exibirFuncionariosPorSalario(funcionarios, "igual")
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

fun cadastrarFuncionarios(funcionarios: MutableList<Funcionario>) {
    for (i in 1..20) {
        print("Digite a matrícula do funcionário $i: ")
        val matricula = readln().toInt()
        print("Digite o nome do funcionário: ")
        val nome = readln()
        print("Digite o salário do funcionário: ")
        val salario = readln().toDouble()

        funcionarios.add(Funcionario(matricula, nome, salario))
    }


    funcionarios.sortBy { it.matricula }
    println("Funcionários cadastrados e ordenados por matrícula.")
}

fun pesquisarFuncionario(funcionarios: List<Funcionario>) {
    print("Digite o número da matrícula do funcionário que deseja pesquisar: ")
    val matriculaPesquisa = readln().toInt()

    val funcionario = funcionarios.find { it.matricula == matriculaPesquisa }
    if (funcionario != null) {
        println("Funcionário encontrado: Matrícula: ${funcionario.matricula}, Nome: ${funcionario.nome}, Salário: R$ ${funcionario.salario}")
    } else {
        println("Funcionário com matrícula $matriculaPesquisa não encontrado.")
    }
}

fun exibirFuncionariosPorSalario(funcionarios: List<Funcionario>, criterio: String) {
    val filtrados = when (criterio) {
        "acima" -> funcionarios.filter { it.salario > 1000.0 }
        "abaixo" -> funcionarios.filter { it.salario < 1000.0 }
        "igual" -> funcionarios.filter { it.salario == 1000.0 }
        else -> emptyList()
    }

    if (filtrados.isNotEmpty()) {
        println("\nFuncionários com salário $criterio de R\$1000,00:")
        for (funcionario in filtrados) {
            println("Matrícula: ${funcionario.matricula}, Nome: ${funcionario.nome}, Salário: R$ ${funcionario.salario}")
        }
    } else {
        println("Nenhum funcionário com salário $criterio de R\$1000,00 encontrado.")
    }
}
