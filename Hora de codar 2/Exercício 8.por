programa {
  funcao inicio() {
    inteiro n1,n2,n3,n4
    inteiro media = 0
    inteiro soma = 0  // soma vai armazenar a soma dos valores digitados 
    inteiro valores = 0 // e valores irá armazenar a quantidade de numeros digitados que são maior q 0 e menor q 10, assim posso calcular a media

    escreva("Digite 4 números: ")
    leia(n1,n2,n3,n4)

    se(n1 > 0 e n1 < 10 ){
      soma = soma + n1
      valores = valores + 1
    }
    se(n2 > 0 e n2 < 10 ){
      soma = soma + n2
      valores = valores + 1
    }
    se(n3 > 0 e n3 < 10 ){
      soma = soma + n3
      valores = valores + 1
    }
    se(n4 > 0 e n4 < 10 ){
      soma = soma + n4
      valores = valores + 1
    }

    media = soma / valores

    se(media >= 5){
      escreva("Você passou no teste!")
    }senao{
      escreva("Tente novamente...")
    }
     
   escreva("\n",valores)
   escreva("\n",soma)
   escreva("\n",media)
   
  
  }
}
