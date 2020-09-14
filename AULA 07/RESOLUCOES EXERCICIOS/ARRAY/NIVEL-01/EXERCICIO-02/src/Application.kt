/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 20:00
 * FINALIDADE DO PROGRAMA: CRIAR UM VETOR QUE RECEBA 10 NUMEROS INTEIROS
 * */

fun main(){

    val numeros = arrayListOf<Int>();

    inserirNumeros(numeros);

    println(numeros.reversed());

}

fun inserirNumeros(numeros: ArrayList<Int>) {

    var numero: Int = 0;

    for(i in 1..2) {

        println("Informe o número $i: ");

        numero = readLine()!!.toInt();

        numeros.add(numero);

    }

}

