programa {
  funcao inicio() {
    inteiro n1
    inteiro n2
    inteiro n3
     
    escreva("Digite o primeiro n�mero ")
    leia(n1)

    escreva("Digite o segundo n�mero ")
    leia(n2)

    escreva("Digite o terceiro n�mero ")
    leia(n3)

    se(n1>n2 e n1>n3){

      escreva("O n�mero(",n1,") � o maior ")
    }
    
    se(n2>n1 e n2 > n3){
      escreva("O n�mero(",n2,") � o maior ")
    } 


    se(n3>n1 e n3>n2){

      escreva("O n�mero(",n3,") � o maior ")
    }
    
  }
}
