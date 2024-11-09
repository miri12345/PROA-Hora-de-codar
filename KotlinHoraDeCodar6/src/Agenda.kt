data class Contato(
    var nome: String,
    var endereco: String,
    var telefone: String
)

fun main() {
    val agenda = mutableListOf<Contato>()

    while (true) {
        println("\nMENU DE OPÇÕES")
        println("1. Cadastrar 10 registros")
        println("2. Pesquisar contato por nome")
        println("3. Classificar registros por nome")
        println("4. Apresentar todos os registros")
        println("5. Sair")
        print("Escolha uma opção: ")

        when (readln().toInt()) {
            1 -> cadastrarContatos(agenda)
            2 -> pesquisarContato(agenda)
            3 -> classificarContatos(agenda)
            4 -> apresentarContatos(agenda)
            5 -> {
                println("Programa encerrado.")
                break
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}


fun cadastrarContatos(agenda: MutableList<Contato>) {
    for (i in 1..10) {
        println("\nCadastro do Contato $i:")
        print("Nome: ")
        val nome = readln()
        print("Endereço: ")
        val endereco = readln()
        print("Telefone: ")
        val telefone = readln()


        agenda.add(Contato(nome, endereco, telefone))
    }
    println("10 contatos cadastrados com sucesso.")
}


fun pesquisarContato(agenda: List<Contato>) {
    print("Digite o nome do contato a ser pesquisado: ")
    val nomePesquisa = readln()


    val contatoEncontrado = agenda.find { it.nome.equals(nomePesquisa, ignoreCase = true) }

    if (contatoEncontrado != null) {
        println("\nContato encontrado:")
        println("Nome: ${contatoEncontrado.nome}")
        println("Endereço: ${contatoEncontrado.endereco}")
        println("Telefone: ${contatoEncontrado.telefone}")
    } else {
        println("Contato não encontrado.")
    }
}


fun classificarContatos(agenda: MutableList<Contato>) {
    agenda.sortBy { it.nome }
    println("Contatos classificados em ordem alfabética por nome.")
}


fun apresentarContatos(agenda: List<Contato>) {
    if (agenda.isEmpty()) {
        println("A agenda está vazia.")
    } else {
        println("\nLista de contatos:")
        agenda.forEachIndexed { index, contato ->
            println("${index + 1}. Nome: ${contato.nome}, Endereço: ${contato.endereco}, Telefone: ${contato.telefone}")
        }
    }
}
