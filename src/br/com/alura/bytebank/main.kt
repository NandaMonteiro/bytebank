package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereço = Endereco()

    println()
    println(1)
    println(1.2)
    println(true)
    println(endereço)

    imprimi(endereço)
}

fun imprimi(valor: Any): Any{
    println(valor)
    return valor
}







