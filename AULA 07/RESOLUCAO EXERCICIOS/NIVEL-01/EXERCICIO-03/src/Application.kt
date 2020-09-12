/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 20:00
 * FINALIDADE DO PROGRAMA: CRIAR UM VETOR QUE RECEBA 5 NUMEROS INTEIROS
 * */

fun main() {

    var quantidadePessoas: Int = 5;

    var array: ArrayList<Double> =  ArrayList<Double>();

    solicitarAlturaPessoas(quantidadePessoas, array);

    println(array.reversed());

}

fun solicitarAlturaPessoas(quantidadePessoas: Int, array: ArrayList<Double>) {

    var numero : Double = 0.0;

    for (i in 1..quantidadePessoas) {

        println("Informe o valor do número ${i}")

        numero = readLine()!!.toDouble();

        array.add(numero);

    }

}