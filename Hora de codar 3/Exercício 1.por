programa {
  funcao inicio() {
    inteiro n1, n2, resultado = 0
    

    escreva("Digite um n�mero: ")
    leia(n1)
    escreva("Digite outro n�mero: ")
    leia(n2)

    enquanto (n2 <= 0 ){
      escreva("N�meros menores e iguais a zero n�o s�o v�lidos! Tente novamente \n")
      leia(n2)
    }
    se(n2 > 0){
      resultado = n1 / n2
      escreva("O resultado da divis�o �: ", resultado)
    }
  }
}
