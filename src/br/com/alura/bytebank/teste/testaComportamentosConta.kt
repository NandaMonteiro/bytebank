import br.com.alura.bytebank.exception.FalhaAuteticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val nanda = Cliente(nome= "Nanda", cpf = "", senha= 123)
    val contaCorrente = ContaCorrente(nanda, 4342)
    contaCorrente.deposita(120.0)
//    println(conta.titular)

    val maria = Cliente(nome = "Maria", cpf = "", senha = 123)
    val contaPoupanca = ContaPoupanca(maria, 4887)
    contaPoupanca.deposita(100.0)
//    println(conta1.titular)

//    println("Deposito em conta")
//    conta.deposita(35.0)
//    println("Saldo ajustado da conta ${conta.saldo}")
//
//    println("Deposito em conta 1")
//    conta1.deposita(5.0)
//    println("Saldo ajustado da conta 1 ${conta1.saldo}")

    println("Saque em conta corrente")
    contaCorrente.saca(10.0)
    println("Saldo ajustado da conta ${contaCorrente.saldo}")

    println("Saque em conta poupança")
    contaPoupanca.saca(70.0)
    println("Saldo ajustado da conta  ${contaPoupanca.saldo}")

    println("Tranferencia")
    try {
        contaCorrente.transfere(100.0, contaPoupanca, 1234)
        println("Tranferencia bem sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha ao realizar tranferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAuteticacaoException){
        println("Erro de autenticação")
        e.printStackTrace()
    } catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }
}
