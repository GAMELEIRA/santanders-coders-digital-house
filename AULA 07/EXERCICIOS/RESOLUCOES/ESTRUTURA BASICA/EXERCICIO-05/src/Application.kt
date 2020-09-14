/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 17:04
 * FINALIDADE DO PROGRAMA: VALIDAR SE O PRIMEIRO NUMERO SEJA MAIOR QUE O SEGUNDO E O TERCEIRO OU CASO O SEGUNDO SEJA MAIOR QUE O TERCEIRO E O QUARTO
 * */

fun main() {

    var numeros : ArrayList<Int> = ArrayList();

    var validado : Boolean = false;

    numeros = solicitarNumeros();

    validado = validarMaiorNumero(numeros);

    println(validado);

}

fun solicitarNumeros(): ArrayList<Int> {

    var numeros: ArrayList<Int> = ArrayList<Int>();

    for(i in 1 .. 4) {

        println("Informe o número $i: ");

        numeros.add(readLine()!!.toInt());

    }

    return numeros;

}

fun validarMaiorNumero(numeros: ArrayList<Int>): Boolean {

    var validacaoUm = numeros.get(0) > numeros.get(2) && numeros.get(0) > numeros.get(3);

    var validacaoDois = numeros.get(1) > numeros.get(2) && numeros.get(1) > numeros.get(3);

    if(validacaoUm || validacaoDois) {

        return true;

    }

    return false;

}
