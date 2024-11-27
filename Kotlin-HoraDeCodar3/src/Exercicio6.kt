fun main(){

    var aprovados = 0

    while(true){
        println("Digite a primeira nota: ")
        val n1 = readln().toDouble()

        println("Digite a segunda nota: ")
        val n2 = readln().toDouble()

        val media = (n1 + n2) / 2

        if(media >= 9.5){
            println("Você está aprovado!")
            aprovados = aprovados + 1
        }else{
            println("Você não foi aprovado")

        }

        println("Calcular a média de outro aluno Sim/Não? (S para Sim e N para Não): ")
        val opcao = readln()

        if(opcao == "N" || opcao == "n") {
            println("Programa finalizado")
            println("Total de alunos aprovados: $aprovados")
            break
        } else if (opcao != "S" && opcao != "s") {
            println("Opção inválida, saindo do programa.")
            println("Total de alunos aprovados: $aprovados")
            break
        }
}
}
