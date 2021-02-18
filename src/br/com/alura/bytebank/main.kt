import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.totalContas


fun main() {


    val nanda = Cliente(nome = "Nanda", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = nanda, numeroConta = 1111)
    testaContasDiferentes()

    println("Total conta: $totalContas")
}









