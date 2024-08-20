programa {
  funcao inicio() {
    inteiro N, i, j

    escreva("Digite o valor de N: ")
    leia(N)

    
    i = 1
    
    
    enquanto (i <= N) {
      escreva("Tabuada do ", i, ":\n")
      
      
      j = 1
      
      enquanto (j <= 10) {
        escreva(i, " x ", j, " = ", i * j, "\n")
        j = j + 1
      }
      
      escreva("\n") 
      i = i + 1
    }
  }
}

