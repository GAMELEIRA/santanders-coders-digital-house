/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 12:24
 * FINALIDADE DO PROGRAMA: REALIZAR A TABUADA DE UM NUMERO N
 * */

fun main() {

    var valorTabuada: Int = 0;

    valorTabuada = solicitarNumero();

    solicitarMultiplicacao(valorTabuada);

}

fun solicitarNumero(): Int {

    var numero : Int = 0;

    println("Informe o número: ");

    numero = readLine()!!.toInt();

    return  numero;

}

fun solicitarMultiplicacao(constante: Int) {

    var resultado: Int = 0;

    for (i in 1..10) {

        if(i == 1){

            println("Tabuada do ${constante}");

        }

        resultado = multiplicar(constante, i);

        println("${constante} X $i = $resultado");

    }

}

fun multiplicar(constante: Int, multiplicador: Int) : Int {

    return constante * multiplicador;

}
