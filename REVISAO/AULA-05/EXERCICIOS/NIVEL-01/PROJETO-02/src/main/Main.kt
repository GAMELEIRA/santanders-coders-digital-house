package main

fun main() {
    val primeiroNumero: Int = solicitarNumero();
    val segundoNumero: Int = solicitarNumero();
    val resultado = somar(primeiroNumero, segundoNumero);
    mostrarResultado(primeiroNumero, segundoNumero, resultado);
}

fun solicitarNumero(): Int {
    println("Informe um número inteiro:")
    return readLine()!!.toInt();
}

fun somar(primeiroNumero: Int, segundoNumero: Int) : Int{
    return primeiroNumero + segundoNumero;
}

fun mostrarResultado(primeiroNumero : Int, segundoNumero: Int, resultado: Int) {
    println("A soma de $primeiroNumero mais $segundoNumero é igual $resultado.");
}