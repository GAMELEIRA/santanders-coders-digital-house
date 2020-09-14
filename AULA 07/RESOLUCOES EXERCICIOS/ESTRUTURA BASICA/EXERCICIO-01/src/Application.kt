/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 14:12
 * FINALIDADE DO PROGRAMA: ANALISAR ENTRE TRES NUMEROS O MAIOR DELE
 * */

fun main() {

    val numeros: ArrayList<Int> = solicitarNumeros();

    var maiorNumero: Int = 0;

    maiorNumero = validarNumeros(numeros);

    apresentarValor(maiorNumero);

}

fun solicitarNumeros(): ArrayList<Int> {

    val numeros: ArrayList<Int> = ArrayList<Int>();

    var cont = 0;

    for(i in 1..3) {

        println("Informe o número que deseja incluir na posicao $i");

        numeros.add(readLine()!!.toInt());

    }

    return numeros;

}

fun validarNumeros(numeros: ArrayList<Int>) = numeros.reduce {acc, numero -> if (acc > numero) acc else numero;}

fun apresentarValor(numero: Int) {

    println("O maior número informado foi: $numero");

}