programa {
  funcao inicio() {
   
    inteiro n1, n2, n3, soma
     
    
    escreva("Digite o primeiro número: ")
    leia(n1)

    escreva("Digite o segundo número: ")
    leia(n2)

    escreva("Digite o terceiro número: ")
    leia(n3)

    

    se(n1 > n2 e n1 > n3){  // comparando para ver se o valor 1 é maior que os outros dois

      se(n2 > n3){  // comparando o segundo maior numero para a soma

        soma = n1 + n2
      } senao{
        soma = n1 + n3 // se nao é o n2, entao é o n3
      }
    }
    senao se(n2 > n1 e n2 > n3){  //caso o valor 1 nao seja o maior numero, entao o n2 precisa ser verificado
      se(n1 > n3){  // se o valor 2 for o primeiro maior, entao precisa verificar entres os restantes qual é o segundo maior
        soma = n2 + n1
      }senao{
        soma = n2 + n3 // se nao for o n1 entao é o n3
      }
      
    }

    senao { //senao pq a verificacao anterior nao teve os maiores numeros
      se(n1 > n2){  // comparação caso nenhum dos outros for o maior, entao sobra o n3, se n1 for maior que o n2 entao a soma e com ele
        soma = n3 + n1  
      }
      senao{
        soma = n3 + n2  // senao a soma é com o n2
      }
    }
     escreva("A soma dos dois maiores valores é: ", soma)
  }
}