import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Nanda",
        numeroConta = 1223
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Marcos",
        numeroConta = 1222
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("br.com.alura.bytebank.modelo.Conta corrente saldo -> ${contaCorrente.saldo}")
    println("br.com.alura.bytebank.modelo.Conta poupanca saldo -> ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("br.com.alura.bytebank.modelo.Conta corrente saldo -> ${contaCorrente.saldo}")
    println("br.com.alura.bytebank.modelo.Conta poupanca saldo -> ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("br.com.alura.bytebank.modelo.Conta corrente saldo -> ${contaCorrente.saldo}")
    println("br.com.alura.bytebank.modelo.Conta poupanca saldo -> ${contaPoupanca.saldo}")
}