/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 18:09
 * FINALIDADE DO PROGRAMA:CALCULAR A MEDIA SALARIAL
 * */

fun main() {

    solicitarInformacoes();

}

fun solicitarInformacoes() {

    var quantoGanhaPorHora: Double = 0.0;

    var quantidadeHorasTrabalhadas: Double = 0.0;

    println("Quanto você ganha por hora?");

    quantoGanhaPorHora = readLine()!!.toDouble();

    println("Quantas horas você trabalha?");

    quantidadeHorasTrabalhadas = readLine()!!.toDouble();

    calcularSalario(quantidadeHorasTrabalhadas, quantoGanhaPorHora);

}

fun calcularSalario(quantidadeHorasTrabalhadas: Double, quantoGanhaPorHora: Double) {

    println("Você ganha: " + (quantidadeHorasTrabalhadas * quantoGanhaPorHora) + " reais.");

}