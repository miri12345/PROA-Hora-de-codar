programa {
  funcao inicio() {
    inteiro n1,n2
    inteiro valor_intervalo = 0
    inteiro soma = 0
   
    real media

    escreva("Digite um n�mero: ")
    leia(n1)
    escreva("Digite outro n�mero (maior que o primeiro): ")
    leia(n2)

    valor_intervalo = n2 - n1 + 1

    enquanto(n1 <= n2){
      soma = soma + n1
      n1 = n1 + 1
    }
    
    media = soma / valor_intervalo

    escreva("A m�dia geral �: ", media)


  }
}
