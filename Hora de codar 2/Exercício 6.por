programa {
  funcao inicio() {
 
    inteiro n1, n2, n3, n4
    inteiro maior  // uma variavel pra armazenar o maior valor

   
    escreva("Digite o primeiro n�mero: ")
    leia(n1)

    escreva("Digite o segundo n�mero: ")
    leia(n2)

    escreva("Digite o terceiro n�mero: ")
    leia(n3)

    escreva("Digite o quarto n�mero: ")
    leia(n4)

    // Inicializa��o da vari�vel maior com o primeiro n�mero
    maior = n1

    // Determina��o do maior valor: assim o valor do maior numero vai enviando para os proximos numeros digitados
    se (n2 > maior) {
      maior = n2
    }
    
    se (n3 > maior) {
      maior = n3
    }
    
    se (n4 > maior) {
      maior = n4
    }

    
    escreva("O primeiro n�mero � ", n1, ", o �ltimo n�mero � ", n4, " e o maior � ", maior, ".")
  }
}
