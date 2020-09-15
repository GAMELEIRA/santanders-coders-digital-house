/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 22:11
 * FINALIDADE DO PROGRAMA: SOMAR IMPOSTOS
 * */

fun main() {

    println(somaImposto(10.0, 100.0));

}

fun somaImposto(taxaImposto: Double, custo: Double) : Double {

    var custoAvaliado : Double = custo;

    custoAvaliado += custo * taxaImposto;

    return custoAvaliado ;

}