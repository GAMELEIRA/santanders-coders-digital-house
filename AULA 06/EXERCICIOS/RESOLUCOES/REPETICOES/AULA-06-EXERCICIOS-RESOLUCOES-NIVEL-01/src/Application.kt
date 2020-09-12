/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 22:17
 * FINALIDADE DO PROGRAMA:
 * */


fun main() {

    var primeirNumero: Int = 5;

    var segundoNumero: Int = -8;

    println(validarNumeroPositivo(primeirNumero));

    println(_validarNumeroPositivo(segundoNumero));

}

fun validarNumeroPositivo(numero: Int): String {

    if(numero <= 0){

        return "N";

    }

    return "P";

}

fun _validarNumeroPositivo(numero: Int) = if (numero <= 0) "N" else "P";