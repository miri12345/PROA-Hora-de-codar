programa {
  funcao inicio() {
   
    inteiro n1, n2, operacao
    real resultado

   
    escreva("Digite dois valores: ")
    leia(n1, n2)

    
    escreva("Qual operação você deseja? Sendo adição (1), subtração (2), divisão (3) e multiplicação (4): ")
    leia(operacao)

    
    se (operacao == 1) {
      resultado = n1 + n2
      escreva("O valor da adição é: ", resultado)
    }
    senao se (operacao == 2) {
      resultado = n1 - n2
      escreva("O valor da subtração é: ", resultado)
    }
    senao se (operacao == 3) {
      se (n2 != 0) {
        resultado = n1 / n2
        escreva("O valor da divisão é: ", resultado)
      } senao {
        escreva("Erro: Divisão por zero não é permitida!")
      }
    }
    senao se (operacao == 4) {
      resultado = n1 * n2
      escreva("O valor da multiplicação é: ", resultado)
    }
    senao {
      escreva("Operação inválida! Por favor, escolha uma operação entre 1 e 4.")
    }
  }
}
