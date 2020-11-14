package main

fun main () {
    val altura = solicitarAltura();
    val pesoIdealFem = calcularPesoIdealMasculino(altura);
    val pesoIdealMasc = calcularPesoIdealMasculino(altura);
    exibirResultado(pesoIdealMasc, pesoIdealFem);
}

fun solicitarAltura(): Double {
    println("Informar sua altura:");
    return readLine()!!.toDouble();
}

fun calcularPesoIdealMasculino(altura: Double) = 72.7 * altura - 58;

fun calcularPesoIdealFeminino(altura: Double) = 62.1 * altura - 44.7;

fun exibirResultado(pesoMaculino: Double, pesoFeminino: Double) {
    println("Para homens: $pesoMaculino");
    println("Para mulheres: $pesoFeminino");
}