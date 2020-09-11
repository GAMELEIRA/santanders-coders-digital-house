/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 10:16
 * FINALIDADE DO PROGRAMA: PROGRAMA QUE IMPRIMA NA TELA APENAS NUMEROS IMPARES ENTRE 1 E 50
 * */

fun main() {

    var numeroMaximo: Int = 50;

    imprimirNumerosImpares(numeroMaximo);

}

fun imprimirNumerosImpares(numeroMaximo : Int) {

    for(i in 1 until numeroMaximo step 2) {

        println(i);

    }

}
