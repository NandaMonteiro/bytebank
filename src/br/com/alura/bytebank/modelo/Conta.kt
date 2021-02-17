package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular:Cliente,
    val numeroConta: Int
) {

    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        } else {
            return false
        }
    }
}