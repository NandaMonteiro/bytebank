class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr :Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
        get() {
            return (salario * 0.1) + plr + salario
        }

}