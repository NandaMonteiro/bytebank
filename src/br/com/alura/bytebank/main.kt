package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(logradouro = "Dr. Epitacio Leite Rolim", complemento = "Saida para Sousa")
    val enderecoNovo = Endereco()

    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())
}

fun imprimi(valor: Any): Any{
    println(valor)
    return valor
}







