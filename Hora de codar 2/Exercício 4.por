programa {
  funcao inicio() {
   
    inteiro n1, n2, n3, soma
     
    
    escreva("Digite o primeiro n�mero: ")
    leia(n1)

    escreva("Digite o segundo n�mero: ")
    leia(n2)

    escreva("Digite o terceiro n�mero: ")
    leia(n3)

    

    se(n1 > n2 e n1 > n3){  // comparando para ver se o valor 1 � maior que os outros dois

      se(n2 > n3){  // comparando o segundo maior numero para a soma

        soma = n1 + n2
      } senao{
        soma = n1 + n3 // se nao � o n2, entao � o n3
      }
    }
    senao se(n2 > n1 e n2 > n3){  //caso o valor 1 nao seja o maior numero, entao o n2 precisa ser verificado
      se(n1 > n3){  // se o valor 2 for o primeiro maior, entao precisa verificar entres os restantes qual � o segundo maior
        soma = n2 + n1
      }senao{
        soma = n2 + n3 // se nao for o n1 entao � o n3
      }
      
    }

    senao { //senao pq a verificacao anterior nao teve os maiores numeros
      se(n1 > n2){  // compara��o caso nenhum dos outros for o maior, entao sobra o n3, se n1 for maior que o n2 entao a soma e com ele
        soma = n3 + n1  
      }
      senao{
        soma = n3 + n2  // senao a soma � com o n2
      }
    }
     escreva("A soma dos dois maiores valores �: ", soma)
  }
}