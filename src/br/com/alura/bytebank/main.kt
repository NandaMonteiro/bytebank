package br.com.alura.bytebank

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testaAny
import testaComportamentosConta
import java.lang.ClassCastException

fun main() {
    testaComportamentosConta()
//    println("inicio main")
//    try {
//        10/0
//    } catch (e :SaldoInsuficienteException){
//        println("SaldoInsuficienteException")
//    }
//    funcao1()
//    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for(i in 1..5){
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}



