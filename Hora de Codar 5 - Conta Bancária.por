programa
{
 
    real saldo = 150.00
    cadeia nome
    inteiro senha = 3589
 
    funcao inicio() {
      escreva("Ol�! Nos informe o seu nome: ")
      leia(nome)

      escreva("Ol� ", nome, " � um prazer ter voc� por aqui \n")
 
      inteiro opcao
   
      escreva("Escolha uma op��o:\n")
      escreva("1. Ver saldo\n")
      escreva("2. Ver extrato\n")
      escreva("3. Fazer saque\n")
      escreva("4. Fazer dep�sito\n") 
      escreva("5. Fazer transfer�ncia\n")
      escreva("6. Sair\n")
      leia(opcao)
 
      escreva("A op��o selecionada foi: " + opcao + "\n")

      escolha(opcao){
        caso 1:
            verSaldo()
        caso 2:
            verExtrato()
        caso 3:
            fazerSaque()
        caso 4:
            fazerDeposito()
        caso 5:
            fazerTransferencia()
        caso 6:
            sair()
        caso contrario:
            erro()
      }
      
      /*se (opcao == 1) {
        verSaldo()
      } senao se(opcao == 2){
        verExtrato()
      } senao se (opcao == 3) {
        fazerSaque()
      } senao se (opcao == 4) {
        fazerDeposito()
      } senao se(opcao == 5){
        fazerTransferencia()
      } senao se (opcao == 6) {
        sair()
      } senao {
        erro()
      }*/
     
    }
 
    funcao verSaldo(){
        escreva("Para ver seu saldo, digite sua senha: ")
        leia(senha)

        se(senha == 3589){
          escreva("Seu saldo atual �: ", saldo, "\n")
          inicio()
        }senao{   
          escreva("Senha inv�lida \n")
          verSaldo()
        }

        
    }
 
    funcao fazerDeposito() {
 
      real deposito

      escreva("Para fazer o dep�sito, digite sua senha: ")
      leia(senha)

        se(senha == 3589){
          escreva("Qual o valor para dep�sito? ")
          leia(deposito)
     
         se (deposito <= 0){
           escreva("Opera��o n�o autorizada\n")
           fazerDeposito()
          } senao {
          saldo = saldo + deposito
          verSaldo()
         }
          
        }senao{
          escreva("Senha inv�lida! \n")
          fazerDeposito()
        }
     
      
    }
 
    funcao fazerSaque(){
   
      real saque

      escreva("Para fazer o saque, digite sua senha: ")
        leia(senha)

        se(senha == 3589){
          escreva("Qual o valor para saque? ")
          leia(saque)
   
        se (saque <= 0) {
            escreva("Por favor, informe um n�mero v�lido.\n")
            fazerSaque()
        }senao se(saque > saldo){
           escreva("Opera��o n�o autorizada")
        }senao {
         saldo = saldo - saque
         verSaldo()
         }
          
        }senao{
          escreva("Senha inv�lida! \n")
          fazerSaque()
        }

      
 
    }
 
    funcao erro() {
      escreva("op��o inv�lida")
      inicio()
    }
 
    funcao sair(){
      escreva("Foi um prazer ter voc� por aqui, ",nome)
    }

    funcao verExtrato(){

      escreva("Para ver seu extrato, digite sua senha: ")
        leia(senha)

        se(senha != 3589){
          escreva("Senha inv�lida!")
          verExtrato()
        }senao{
          escreva("Seu extrato �: \n")
          escreva("Dep�sito de R$ 219,99 \n")
          escreva("Mercado Atacadista R$ 518,99 \n")
          escreva("Saque de R$ 200,00 \n")
          inicio()

        }
         
    }

    funcao fazerTransferencia(){
      real transferencia
      inteiro contaDoBanco = 12345

      escreva("Para fazer a transfer�ncia, digite sua senha: ")
      leia(senha)

        se(senha == 3589){
          
          escreva("Informe o n�mero da conta banc�ria (apenas n�meros): ")
          leia(contaDoBanco)
             
             se(contaDoBanco == 12345){
                escreva("Informe o valor da transfer�ncia: ")
                leia(transferencia)

                se(transferencia <= 0){
                escreva("Informe um valor v�lido \n")
                }senao se(transferencia > saldo){
                escreva("Saldo insuficiente!")
                fazerTransferencia()
                }senao{
                 saldo = saldo - transferencia
                 escreva("Seu saldo atual �: ", saldo,"\n")
                 inicio()
                }
               
               }senao{
              escreva("Valor de conta inv�lido! \n")
              fazerTransferencia()
             }
             }senao{
               escreva("Senha inv�lida! \n")
               fazerTransferencia()
        }
      
    }
 
}
 
/* $$$ Portugol Studio $$$
 *
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 *
 * @POSICAO-CURSOR = 47;
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */