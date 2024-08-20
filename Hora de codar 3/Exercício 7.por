programa {
  funcao inicio() {
    real nota, soma = 0, media
    inteiro notas = 1

    
    enquanto (notas <= 6) {
      escreva("Digite a nota ", notas, ": ")
      leia(nota)

      
      se (nota >= 0 e nota <= 10) {
        soma = soma + nota
        notas = notas + 1
      } senao {
        escreva("Nota inválida! Digite um valor entre 0 e 10.\n")
      }
    }

    
    media = soma / 6

    
    escreva("A média das notas é: ", media, "\n")
  }
}
