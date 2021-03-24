package br.com.alura.bytebank.exception

class FalhaAuteticacaoException(
    mensagem: String = "Falha na Autenticação"
): Exception(mensagem){
}