import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val nanda = Cliente(nome = "Nanda", cpf = "", senha = 123)
    val contaCorrente = ContaCorrente(
        titular = nanda,
        numeroConta = 1223
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Marcos", cpf = "", senha = 123),
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