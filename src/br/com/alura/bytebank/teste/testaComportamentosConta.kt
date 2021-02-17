import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val contaCorrente = ContaCorrente("Nanda", 4342)
    contaCorrente.deposita(120.0)
//    println(conta.titular)

    val contaPoupanca = ContaPoupanca("Maria", 4887)
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
    if (contaCorrente.transfere(20.0, contaPoupanca)) {
        println("Tranferencia bem sucedida")
    } else {
        println("Falha ao realizar tranferencia")
    }
}
