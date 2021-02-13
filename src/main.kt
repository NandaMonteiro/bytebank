fun main() {
    println("Bem Vindo ao Bytebank")

    val contaCorrente = ContaCorrente(
        titular = "Nanda",
        numeroConta = 1223
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Marcos",
        numeroConta =  1222
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Conta corrente saldo -> ${contaCorrente.saldo}")
    println("Conta poupanca saldo -> ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)
    println("Conta corrente saldo -> ${contaCorrente.saldo}")
    println("Conta poupanca saldo -> ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("Conta corrente saldo -> ${contaCorrente.saldo}")
    println("Conta poupanca saldo -> ${contaPoupanca.saldo}")

}





