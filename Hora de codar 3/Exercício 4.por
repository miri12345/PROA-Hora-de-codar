programa {
  funcao inicio() {
  
    inteiro soma = 0
    inteiro valor_intervalo = 0
    inteiro i = 15
    real media

    
    valor_intervalo = 101 - 15 

    enquanto (i <= 100) {
      soma = soma + i
      i = i + 1
    }

    
    media = soma / valor_intervalo

    
    escreva("A média geral é: ", media)
  }
}

 
