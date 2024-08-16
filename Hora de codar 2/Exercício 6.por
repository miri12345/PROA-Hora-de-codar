programa {
  funcao inicio() {
 
    inteiro n1, n2, n3, n4
    inteiro maior  // uma variavel pra armazenar o maior valor

   
    escreva("Digite o primeiro número: ")
    leia(n1)

    escreva("Digite o segundo número: ")
    leia(n2)

    escreva("Digite o terceiro número: ")
    leia(n3)

    escreva("Digite o quarto número: ")
    leia(n4)

    // Inicialização da variável maior com o primeiro número
    maior = n1

    // Determinação do maior valor: assim o valor do maior numero vai enviando para os proximos numeros digitados
    se (n2 > maior) {
      maior = n2
    }
    
    se (n3 > maior) {
      maior = n3
    }
    
    se (n4 > maior) {
      maior = n4
    }

    
    escreva("O primeiro número é ", n1, ", o último número é ", n4, " e o maior é ", maior, ".")
  }
}
