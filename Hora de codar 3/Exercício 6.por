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
      escreva("Voc� est� aprovado!")
      aprovados = aprovados + 1
    }senao{
      escreva("Voc� n�o foi aprovado")
      
    }

    escreva("Calcular a m�dia de outro aluno Sim/N�o? (S para Sim e N para N�o): ")
      leia(opcao)

      se (opcao == "N" ou opcao == "n") {
        escreva("Programa finalizado\n")
        escreva("Total de alunos aprovados: ", aprovados, "\n")
        pare 
      } senao se (opcao != "S" e opcao != "s") {
        escreva("Op��o inv�lida, saindo do programa.\n")
        escreva("Total de alunos aprovados: ", aprovados, "\n")
        pare
      }
    }
  }

  
}
