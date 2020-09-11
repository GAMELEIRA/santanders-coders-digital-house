/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 06/09/2020
 * HORA: 21:15
 * FINALIDADE DO PROGRAMA: SOLICITA DOIS NUMEROS E FACA A SOMA
 * */

fun main () {

    var numero1 : Double = 0.0;

    var numero2 : Double = 0.0;

    var valoresSomados : Double = 0.0;

    numero1 = solicitarNumeros();

    numero2 = solicitarNumeros();

    valoresSomados = somarValores(numero1, numero2);

    exibirResultado(valoresSomados);

}

fun solicitarNumeros() : Double {

    var numero : Double = 0.0;

    println("Informe o número: ");

    numero = readLine()!!.toDouble();

    return numero;

}

fun somarValores(numero1: Double, numero2: Double) : Double {

    return numero1 + numero2;

}

fun exibirResultado(resultado : Double) {

    println("O resultado da soma foi ${resultado}");

}