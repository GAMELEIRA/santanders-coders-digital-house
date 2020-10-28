package main

fun main() {
    val numero = solicitarNumero();
    exibirNumero(numero);
}

fun solicitarNumero(): String {
    println("Informe um número:");
    return readLine()!!.toString()
}

fun exibirNumero(numero: String) {
    println("O número informado foi o $numero");
}