fun testaComportamentosConta() {

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
