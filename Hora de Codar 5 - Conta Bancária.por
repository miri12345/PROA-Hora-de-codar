programa
{
 
    real saldo = 150.00
    cadeia nome
    inteiro senha = 3589
 
    funcao inicio() {
      escreva("Olá! Nos informe o seu nome: ")
      leia(nome)

      escreva("Olá ", nome, " é um prazer ter você por aqui \n")
 
      inteiro opcao
   
      escreva("Escolha uma opção:\n")
      escreva("1. Ver saldo\n")
      escreva("2. Ver extrato\n")
      escreva("3. Fazer saque\n")
      escreva("4. Fazer depósito\n") 
      escreva("5. Fazer transferência\n")
      escreva("6. Sair\n")
      leia(opcao)
 
      escreva("A opção selecionada foi: " + opcao + "\n")

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
          escreva("Seu saldo atual é: ", saldo, "\n")
          inicio()
        }senao{   
          escreva("Senha inválida \n")
          verSaldo()
        }

        
    }
 
    funcao fazerDeposito() {
 
      real deposito

      escreva("Para fazer o depósito, digite sua senha: ")
      leia(senha)

        se(senha == 3589){
          escreva("Qual o valor para depósito? ")
          leia(deposito)
     
         se (deposito <= 0){
           escreva("Operação não autorizada\n")
           fazerDeposito()
          } senao {
          saldo = saldo + deposito
          verSaldo()
         }
          
        }senao{
          escreva("Senha inválida! \n")
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
            escreva("Por favor, informe um número válido.\n")
            fazerSaque()
        }senao se(saque > saldo){
           escreva("Operação não autorizada")
        }senao {
         saldo = saldo - saque
         verSaldo()
         }
          
        }senao{
          escreva("Senha inválida! \n")
          fazerSaque()
        }

      
 
    }
 
    funcao erro() {
      escreva("opção inválida")
      inicio()
    }
 
    funcao sair(){
      escreva("Foi um prazer ter você por aqui, ",nome)
    }

    funcao verExtrato(){

      escreva("Para ver seu extrato, digite sua senha: ")
        leia(senha)

        se(senha != 3589){
          escreva("Senha inválida!")
          verExtrato()
        }senao{
          escreva("Seu extrato é: \n")
          escreva("Depósito de R$ 219,99 \n")
          escreva("Mercado Atacadista R$ 518,99 \n")
          escreva("Saque de R$ 200,00 \n")
          inicio()

        }
         
    }

    funcao fazerTransferencia(){
      real transferencia
      inteiro contaDoBanco = 12345

      escreva("Para fazer a transferência, digite sua senha: ")
      leia(senha)

        se(senha == 3589){
          
          escreva("Informe o número da conta bancária (apenas números): ")
          leia(contaDoBanco)
             
             se(contaDoBanco == 12345){
                escreva("Informe o valor da transferência: ")
                leia(transferencia)

                se(transferencia <= 0){
                escreva("Informe um valor válido \n")
                }senao se(transferencia > saldo){
                escreva("Saldo insuficiente!")
                fazerTransferencia()
                }senao{
                 saldo = saldo - transferencia
                 escreva("Seu saldo atual é: ", saldo,"\n")
                 inicio()
                }
               
               }senao{
              escreva("Valor de conta inválido! \n")
              fazerTransferencia()
             }
             }senao{
               escreva("Senha inválida! \n")
               fazerTransferencia()
        }
      
    }
 
}
 
