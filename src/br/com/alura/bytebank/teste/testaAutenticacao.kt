import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Fernanda",
        cpf = "111.222.333-44",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Paulo",
        cpf = "999.888.777-66",
        salario = 2000.0,
        senha = 4321,
        plr = 150.0
    )

    val cliente = Cliente(
        nome = "Paulo",
        cpf = "999.888.777-66",
        senha = 1221
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretor, 4321)
    sistema.entra(cliente, 1221)
}