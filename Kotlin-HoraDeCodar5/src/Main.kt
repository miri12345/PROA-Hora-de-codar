import java.util.*

object Main {
    var saldo: Double = 150.00
    var senhaCorreta: Int = 3589
    var scanner: Scanner = Scanner(System.`in`)

    @JvmStatic
    fun main(args: Array<String>) {
        println("Olá, nos informe o seu nome: ")
        val nome = scanner.nextLine()
        println("Olá, $nome é um prazer ter você por aqui")

        while (true) {
            println("Escolha uma opção: ")
            println("1. Ver saldo")
            println("2. Ver extrato")
            println("3. Fazer saque")
            println("4. Fazer depósito")
            println("5. Fazer transferência")
            println("6. Sair\n")

            val opcao = scanner.nextInt()

            when (opcao) {
                1 -> verSaldo()
                2 -> verExtrato()
                3 -> fazerSaque()
                4 -> fazerDeposito()
                5 -> fazerTransferencia()
                6 -> {
                    sair(nome)
                    return
                }

                else -> println("Opção inválida.")
            }
        }
    }

    fun verSaldo() {
        println("Para ver seu saldo, digite sua senha: ")
        val senha = scanner.nextInt()

        if (senha == senhaCorreta) {
            println("Seu saldo atual é: " + saldo)
        } else {
            println("Senha inválida")
            verSaldo()
        }
    }

    fun verExtrato() {
        println("Para ver seu extrato, digite sua senha: ")
        val senha = scanner.nextInt()

        if (senha != senhaCorreta) {
            println("Senha inválida! ")
            verExtrato()
        } else {
            println("Seu extrato é: ")
            println("Depósito de R$ 219,99 ")
            println("Mercado Atacadista R$ 518,99 ")
            println("Saque de R$ 200,00 ")
        }
    }

    fun fazerSaque() {
        println("Para fazer o saque, digite sua senha: ")
        val senha = scanner.nextInt()

        if (senha == senhaCorreta) {
            println("Qual o valor para saque? ")
            val saque = scanner.nextDouble()

            if (saque <= 0) {
                println("Por favor, informe um número válido.")
                fazerSaque()
            } else if (saque > saldo) {
                println("Operação não autorizada")
            } else {
                saldo = saldo - saque
                verSaldo()
            }
        } else {
            println("Senha inválida!")
            fazerSaque()
        }
    }

    fun fazerDeposito() {
        println("Para fazer o depósito, digite sua senha: ")
        val senha = scanner.nextInt()

        if (senha == senhaCorreta) {
            println("Qual o valor para depósito? ")
            val deposito = scanner.nextDouble()

            if (deposito <= 0) {
                println("Operação não autorizada")
                fazerDeposito()
            } else {
                saldo = saldo + deposito
                verSaldo()
            }
        } else {
            println("Senha inválida! ")
            fazerDeposito()
        }
    }

    fun fazerTransferencia() {
        println("Para fazer a transferência, digite sua senha: ")
        val senha = scanner.nextInt()
        scanner.nextLine()
        if (senha == senhaCorreta) {
            println("Informe o número da conta bancária (apenas números): ")
            val contaDoBanco = scanner.nextLine()

            if (isNumeric(contaDoBanco)) {
                val contaNumero = contaDoBanco.toInt()
                println("Informe o valor da transferência: ")
                val transferencia = scanner.nextDouble()

                if (transferencia <= 0) {
                    println("Informe um valor válido \n")
                } else if (transferencia > saldo) {
                    println("Saldo insuficiente!")
                    fazerTransferencia()
                } else {
                    saldo = saldo - transferencia
                    println("Seu saldo atual é: " + saldo)
                }
            } else {
                println("Valor de conta inválido!")
                fazerTransferencia()
            }
        } else {
            println("Senha inválida!")
            fazerTransferencia()
        }
    }


    fun sair(nome: String) {
        println("Foi um prazer ter você por aqui, $nome")
    }

    fun isNumeric(stringToCheck: String): Boolean {
        return stringToCheck.matches("\\d+".toRegex())
    }
}