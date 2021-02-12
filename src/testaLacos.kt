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
