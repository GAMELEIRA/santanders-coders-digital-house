/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 06/09/2020
 * HORA: 20:58
 * FINALIDADE DO PROGRAMA: SOLICITA UM NUMERO E APRESENTA O NUMERO INFORMADO
 * */

fun main () {

    var numeroInformado : Double = 0.0;

    numeroInformado = solicitarNumero();

    exibirResultado(numeroInformado);

}

fun solicitarNumero() : Double {

    var valorInformado: Double = 0.0;

    println("Informe um número: ");

    valorInformado = readLine()!!.toDouble();

    return valorInformado;

}

fun exibirResultado(valorInformado: Double) {

    print("O valor informado foi: ${valorInformado}");

}