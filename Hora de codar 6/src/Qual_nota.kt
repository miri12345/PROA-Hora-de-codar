data class Aluno(val nome: String, val notas: List<Double>) {
    val media: Double
        get() = notas.average()

    val status: String
        get() = if (media >= 5) "Aprovado" else "Reprovado"
}

fun main() {
    val listaAlunos = mutableListOf<Aluno>()

    while (true) {
        println("\nMenu de Opções:")
        println("1. Cadastrar alunos")
        println("2. Pesquisar aluno por nome")
        println("3. Exibir todos os alunos")
        println("4. Sair")
        print("Escolha uma opção: ")
        when (readln().toInt()) {
            1 -> cadastrarAlunos(listaAlunos)
            2 -> pesquisarAluno(listaAlunos)
            3 -> exibirTodosAlunos(listaAlunos)
            4 -> {
                println("Saindo do programa...")
                break
            }
            else -> println("Opção inválida!")
        }
    }
}


fun cadastrarAlunos(listaAlunos: MutableList<Aluno>) {
    for (i in 1..20) {
        print("Digite o nome do aluno $i: ")
        val nome = readln()

        val notas = mutableListOf<Double>()
        for (j in 1..4) {
            print("Digite a nota $j do aluno $nome: ")
            val nota = readln().toDouble()
            notas.add(nota)
        }


        listaAlunos.add(Aluno(nome, notas))
    }


    listaAlunos.sortBy { it.nome }
    println("Alunos cadastrados com sucesso e ordenados por nome!")
}


fun pesquisarAluno(listaAlunos: List<Aluno>) {
    print("Digite o nome do aluno que deseja pesquisar: ")
    val nomePesquisa = readln()


    val aluno = listaAlunos.find { it.nome.equals(nomePesquisa, ignoreCase = true) }

    if (aluno != null) {
        println("Aluno encontrado: ${aluno.nome}")
        println("Média: ${aluno.media}")
        println("Status: ${aluno.status}")
    } else {
        println("Aluno não encontrado!")
    }
}


fun exibirTodosAlunos(listaAlunos: List<Aluno>) {
    if (listaAlunos.isEmpty()) {
        println("Nenhum aluno cadastrado!")
        return
    }

    println("\nLista de Alunos:")
    listaAlunos.forEach { aluno ->
        println("Nome: ${aluno.nome}, Média: ${aluno.media}, Status: ${aluno.status}")
    }
}
