import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numetoY = numeroX
    numetoY++

//    println("numero X $numeroX")
//    println("numero Y $numetoY")

    val conta2 = ContaCorrente("Marcos", 4443)
    conta2.titular = "Marcos"
    var conta3 = conta2
    conta3.titular = "Pedro"

//    println("Titular conta 2: ${conta2.titular}")
//    println("Titular conta 3: ${conta3.titular}")

}