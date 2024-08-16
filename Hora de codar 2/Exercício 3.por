programa {
  funcao inicio() {
    inteiro n1
    inteiro n2
    inteiro n3
     
    escreva("Digite o primeiro número ")
    leia(n1)

    escreva("Digite o segundo número ")
    leia(n2)

    escreva("Digite o terceiro número ")
    leia(n3)

    se(n1>n2 e n1>n3){

      escreva("O número(",n1,") é o maior ")
    }
    
    se(n2>n1 e n2 > n3){
      escreva("O número(",n2,") é o maior ")
    } 


    se(n3>n1 e n3>n2){

      escreva("O número(",n3,") é o maior ")
    }
    
  }
}
