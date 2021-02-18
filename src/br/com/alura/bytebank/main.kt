import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaPoupanca


fun main() {


    val nanda = Cliente(nome = "Nanda", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = nanda, numeroConta = 1111)
    testaContasDiferentes()

    println("Total conta: ${Conta.total}")
}









