package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: String,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta

){
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            System.out.println("Saldo insuficiente para realizar operação")
        }
    }
}