import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numetoY = numeroX
    numetoY++

//    println("numero X $numeroX")
//    println("numero Y $numetoY")

    val marcos = Cliente("Marcos", "", 123)
    val conta2 = ContaCorrente(marcos, 4443)
//    conta2.titular.nome = "Marcos"
//    var conta3 = conta2
//    conta3.titular = "Pedro"

//    println("Titular conta 2: ${conta2.titular}")
//    println("Titular conta 3: ${conta3.titular}")

}
