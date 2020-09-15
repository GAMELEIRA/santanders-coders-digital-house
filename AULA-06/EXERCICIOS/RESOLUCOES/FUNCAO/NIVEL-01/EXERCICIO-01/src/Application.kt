/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 22:11
 * FINALIDADE DO PROGRAMA: SOMAR 3 NUMEROS
 * */

fun main() {

    var numero1: Double = 0.0;

    var numero2: Double = 0.0;

    var numero3: Double = 0.0;

    println("Informe o número 1:");

    numero1 = readLine()!!.toDouble();

    println("Informe o número 2:");

    numero2 = readLine()!!.toDouble();

    println("Informe o número 3:");

    numero3 = readLine()!!.toDouble();

    println("O resultado é: " + somarNumeros(numero1, numero2, numero3));

}

fun somarNumeros(numero1: Double, numero2: Double, numero3: Double) = numero1 + numero2 + numero3;
