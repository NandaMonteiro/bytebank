package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAuteticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException


abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int
): Autenticavel {

    var saldo = 0.0
        protected set

    companion object {
        var total = 0
        private set

    }

    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }
    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(saldo < valor){
            throw SaldoInsuficienteException(
                mensagem = "Saldo Insuficiente, saldo atual: $saldo")
        }

        if(!autentica(senha)){
            throw FalhaAuteticacaoException(
                mensagem = "Erro de Autenticação, senha incorreta!"
            )
        }

        this.saldo -= valor
        destino.deposita(valor)
    }
}

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            System.out.println("Saldo insuficiente para realizar operação")
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta

){

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            System.out.println("Saldo insuficiente para realizar operação")
        }
    }
}