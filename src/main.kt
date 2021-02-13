fun main() {
    println("Bem Vindo ao Bytebank")

    val funcionario = Funcionario(
        nome = "Fernanda",
        cpf = "111.222.333-45",
        salario = 100.00,
    )

    println("Nome ${funcionario.nome}")
    println("Salário ${funcionario.salario}")
    println("Bonificação ${funcionario.bonificacao()}")

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

    if (gerente.autentica(123)) {
        println("Autentecação confirmada")
    } else {
        println("Erro na autenticação")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)

    println("Total de bonificação: ${calculadora.total}")

}



