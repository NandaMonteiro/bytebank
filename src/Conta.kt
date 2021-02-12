class Conta(var titular: String, val numeroConta: Int) {
    //    var titular = titular
//    var numeroConta = numeroConta
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numeroConta = numero
//
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            System.out.println("Saldo insuficiente para realizar operação")
        }
    }

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