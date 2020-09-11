/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 20:00
 * FINALIDADE DO PROGRAMA: CRIAR UM VETOR QUE RECEBA 5 NUMEROS INTEIROS
 * */

fun main() {

    val array = arrayListOf<Int>();

    solicitarValores(array);

    println(array);

}

fun solicitarValores(array: ArrayList<Int>) {

    var valorInformado: Int = 0;

    for(i in 1 .. 5) {

        println("Informe o valor ${i}");

        valorInformado = readLine()!!.toInt();

        array.add(valorInformado);

    }

}