programa {
  funcao inicio() {
    inteiro n1, n2, resultado = 0
    

    escreva("Digite um número: ")
    leia(n1)
    escreva("Digite outro número: ")
    leia(n2)

    enquanto (n2 <= 0 ){
      escreva("Números menores e iguais a zero não são válidos! Tente novamente \n")
      leia(n2)
    }
    se(n2 > 0){
      resultado = n1 / n2
      escreva("O resultado da divisão é: ", resultado)
    }
  }
}
