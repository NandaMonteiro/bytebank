fun main() {
    println("Bem Vindo ao Bytebank")

    val nanda = Funcionario(
        nome = "Fernanda",
        cpf = "111.222.333-45",
        salario = 100.00,
    )

    println("Nome ${nanda.nome}")
    println("Salário ${nanda.salario}")
    println("Bonificação ${nanda.bonificacao()}")

    val Ana = Gerente(
        nome = "Ana",
        cpf = "111.222.333-45",
        salario = 200.00,
        senha = 123
    )

    println("Nome ${Ana.nome}")
    println("Salário ${Ana.salario}")
    println("Bonificação ${Ana.bonificacao()}")

    if (Ana.autentica(123)) {
        println("Autentecação confirmada")
    } else {
        println("Erro na autenticação")
    }

}



