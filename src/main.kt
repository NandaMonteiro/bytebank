fun main() {
    println("Bem Vindo ao Bytebank")
    val conta = Conta("Nanda", 4342)
    conta.deposita(120.0)
//    println(conta.titular)

    val conta1 = Conta("Maria", 4887)
    conta1.deposita(50.0)
//    println(conta1.titular)

//    println("Deposito em conta")
//    conta.deposita(35.0)
//    println("Saldo ajustado da conta ${conta.saldo}")
//
//    println("Deposito em conta 1")
//    conta1.deposita(5.0)
//    println("Saldo ajustado da conta 1 ${conta1.saldo}")

    println("Saque em conta")
    conta.saca(10.0)
    println("Saldo ajustado da conta ${conta.saldo}")

    println("Saque em conta 1")
    conta1.saca(70.0)
    println("Saldo ajustado da conta 1 ${conta1.saldo}")

    println("Tranferencia")
    if (conta.transfere(20.0, conta1)) {
        println("Tranferencia bem sucedida")
    } else {
        println("Falha ao realizar tranferencia")
    }

}

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

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numetoY = numeroX
    numetoY++

//    println("numero X $numeroX")
//    println("numero Y $numetoY")

    val conta2 = Conta("Marcos", 4443)
    conta2.titular = "Marcos"
    var conta3 = conta2
    conta3.titular = "Pedro"

//    println("Titular conta 2: ${conta2.titular}")
//    println("Titular conta 3: ${conta3.titular}")

}

fun testaLacos() {
    for (i in 1..5) {

        val titular = "Fernanda $i"
        val numeroConta = 1000 + i
        var saldo = 10.0 + i

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
    }

    for (i in 5 downTo 1 step 2) {

        val titular = "Fernanda $i"
        val numeroConta = 1000 + i
        var saldo = 10.0 + i

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()

    }

    var j = 0
    while (j < 5) {
        val titular = "Fernanda $j"
        val numeroConta = 1000 + j
        var saldo = 10.0 + j

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println("=============================")
        j++
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }
//    ============================
    when {
        saldo > 0.0 -> {
            println("Conta é positiva")
        }
        saldo == 0.0 -> {
            println("Conta é neutra")
        }
        else -> {
            println("Conta é negativa")
        }
    }
//    ================================
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}