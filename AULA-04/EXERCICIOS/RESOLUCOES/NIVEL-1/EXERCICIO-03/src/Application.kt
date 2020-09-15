/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 06/09/2020
 * HORA: 22:05
 * FINALIDADE DO PROGRAMA: CONVERTE METROS PARA CENTIMETROS
 * */

fun main() {

    var metros : Double = 0.0;

    var centimetros : Double = 0.0;

    metros = solicitarMetros();

    centimetros = converteMetrosEmCentimetros(metros);

    exibirResultado(metros, centimetros);

}

fun solicitarMetros(): Double {

    var metros: Double = 0.0;

    println("Informe o valor númerico que representa os metros para serem convertidos: ");

    metros = readLine()!!.toDouble();

    return metros;

}

fun converteMetrosEmCentimetros(metros: Double) : Double {

    var centimetros: Double = 0.0;

    centimetros = metros * 100;

    return centimetros;

}

fun exibirResultado(metros: Double, centimetros: Double) {

    println("${metros} m são ${centimetros} em cm.");

}