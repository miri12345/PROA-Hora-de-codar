programa {
  funcao inicio() {
    
    inteiro n1, n2, n3, n4, n5, n6
    inteiro soma = 0

    
    escreva("Digite seis n�meros: ")
    leia(n1, n2, n3, n4, n5, n6)

    /* a soma come�a com 0, conforme as verifica��es os valores v�o sendo adicionados a variavel soma caso seja menor que 72
     senao a soma continua guardando valor menor que 72 ate o proximo menor que 72*/
    se (n1 < 72) {
      soma = soma + n1
    }

    se (n2 < 72) {
      soma = soma + n2
    }

    se (n3 < 72) {
      soma = soma + n3
    }

    se (n4 < 72) {
      soma = soma + n4
    }

    se (n5 < 72) {
      soma = soma + n5
    }

    se (n6 < 72) {
      soma = soma + n6
    }

    // Exibi��o dos resultados
    escreva("A soma dos valores menores que 72 �: ", soma, "\n")
    escreva("Os valores informados s�o: ", n1, ", ", n2, ", ", n3, ", ", n4, ", ", n5, " e ", n6)
  }
}
