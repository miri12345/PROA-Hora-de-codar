programa {
  funcao inicio() {
    inteiro n1,n2
    cadeia operacao
    real resultado

    escreva("Digite dois valores: ")
    leia(n1,n2)
    escreva("Qual opera��o voc� deseja? Sendo adi��o (1), subtra��o (2), divis�o (3) e multiplica��o (4): ")
    leia(operacao)

    se(operacao == 1){
      resultado= n1+n2
      escreva("O valor da adi��o � ",resultado,"")
    }
    se(operacao == 2){
      resultado = n1-n2
      escreva("O valor da subtra��o � ",resultado,"")
    }
    se(operacao == 3){
      resultado = n1/n2
      escreva("O valor da divis�o � ",resultado,"")
    }
    se(operacao == 4){
      resultado = n1*n2
      escreva("O valor da multiplica��o � ",resultado,"")
    }

    
  }
}
