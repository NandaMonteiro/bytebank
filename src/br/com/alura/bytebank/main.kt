package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Dr. Epitacio Leite Rolim",
        complemento = "Saida para Sousa",
        cep = "589000009",
        estado = "Paraiba",
        cidade = "Cajazeiras"
    )
    val enderecoNovo = Endereco(
        logradouro = "Júlio Pajéu",
        complemento = "",
        cep = "589000009",
        estado = "Paraiba",
        cidade = "Cajazeiras"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())
}

fun imprimi(valor: Any): Any{
    println(valor)
    return valor
}







