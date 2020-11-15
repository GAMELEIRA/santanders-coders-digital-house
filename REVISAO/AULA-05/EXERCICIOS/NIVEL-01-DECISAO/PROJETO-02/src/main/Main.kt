package main

fun main() {
    val numero = solicitarNumeroInteiro();
    exibirResultado(validarSeEPar(numero));
}

fun solicitarNumeroInteiro(): Int {
    println("Informe um número inteiro: ");
    return readLine()!!.toInt();
}

fun validarSeEPar(numero: Number): Boolean = numero.toDouble() % 2.0 === 0.0;

fun exibirResultado (valor: Boolean) {
    if (valor){
        println("Número par");
    } else {
        println("Número impar");
    }
}