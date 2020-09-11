/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 14:57
 * FINALIDADE DO PROGRAMA:
 * */

fun main() {

    var valorSaque: Double = 0.0;

    var aprovacaoSaque : Boolean = false;

    valorSaque = solicitarValorSaque();

    aprovacaoSaque = validarMinimoMaximo(valorSaque);

    if(aprovacaoSaque) {

        liberarNotas(valorSaque);

    }

}

fun solicitarValorSaque(): Double {

    var valorSaque: Double = 0.0;

    println("Informe o valor do saque: ");

    valorSaque = readLine()!!.toDouble();

    return valorSaque;

}

fun validarMinimoMaximo(valorSaque: Double): Boolean {

    var valorMinimo : Double = 600.0;

    var valorMaximo : Double = 10.0;

    var aprovacaoSaque : Boolean = false;

    aprovacaoSaque = valorSaque >= valorMinimo && valorSaque <= valorMaximo;

    return aprovacaoSaque;

}

fun liberarNotas(valorSaque: Double){

    var notaUm = 1;

    var notaCinco = 5;

    var notaDez = 10;

    var notaCinquenta = 50;

    var notaCem = 100;



}

fun calcularNotas(nota: Double, valorSaque: Double){



}