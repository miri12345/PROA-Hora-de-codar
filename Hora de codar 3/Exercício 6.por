programa {
  funcao inicio() {
 
    real n1, n2, media
    cadeia opcao
    inteiro aprovados = 0

    enquanto(verdadeiro){
      escreva("Digite a primeira nota: ")
    leia(n1)
    escreva("Digite a segunda nota: ")
    leia(n2)

    media = (n1 + n2) / 2

    se(media >= 9.5){
      escreva("Você está aprovado!")
      aprovados = aprovados + 1
    }senao{
      escreva("Você não foi aprovado")
      
    }

    escreva("Calcular a média de outro aluno Sim/Não? (S para Sim e N para Não): ")
      leia(opcao)

      se (opcao == "N" ou opcao == "n") {
        escreva("Programa finalizado\n")
        escreva("Total de alunos aprovados: ", aprovados, "\n")
        pare 
      } senao se (opcao != "S" e opcao != "s") {
        escreva("Opção inválida, saindo do programa.\n")
        escreva("Total de alunos aprovados: ", aprovados, "\n")
        pare
      }
    }
  }

  
}
