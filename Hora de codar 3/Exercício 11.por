programa {
  funcao inicio() {
    inteiro valor
    inteiro dentroIntervalo = 0
    inteiro foraIntervalo = 0
    inteiro i = 1

    enquanto (i <= 10) {
      escreva("Digite o valor ", i, ": ")
      leia(valor)
      
      se (valor >= 24 e valor <= 42) {
        dentroIntervalo = dentroIntervalo + 1
      } senao {
        foraIntervalo = foraIntervalo + 1
      }

      i = i + 1
    }
    
    escreva("Quantidade de valores entre 24 e 42: ", dentroIntervalo, "\n")
    escreva("Quantidade de valores fora do intervalo 24 e 42: ", foraIntervalo, "\n")
  }
}

