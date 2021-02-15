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
    sistema.entra(gerente, gerente.senha)
    sistema.entra(diretor, diretor.senha)
    sistema.entra(cliente, cliente.senha)
}