fun testaFuncionarios() {
    val gerente = Gerente(
        nome = "Ana",
        cpf = "111.222.333-45",
        salario = 200.00,
        senha = 123
    )

    println("Nome ${gerente.nome}")
    println("Salário ${gerente.salario}")
    println("Bonificação ${gerente.bonificacao()}")

    val diretor = Diretor(
        nome = "Marcos",
        cpf = "111.222.333-45",
        salario = 500.00,
        senha = 123,
        plr = 20.0
    )

    println("Nome ${diretor.nome}")
    println("Salário ${diretor.salario}")
    println("Bonificação ${diretor.bonificacao()}")

    val analista = Analista(
        nome = "Beto",
        cpf = "111.222.333-45",
        salario = 400.00
    )

    println("Nome ${analista.nome}")
    println("Salário ${analista.salario}")
    println("Bonificação ${analista.bonificacao()}")

    if (gerente.autentica(123)) {
        println("Autentecação confirmada")
    } else {
        println("Erro na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    calculadora.registra(analista)

    println("Total de bonificação: ${calculadora.total}")
}