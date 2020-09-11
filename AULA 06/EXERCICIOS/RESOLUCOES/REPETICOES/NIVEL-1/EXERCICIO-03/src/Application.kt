/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 10:34
 * FINALIDADE DO PROGRAMA: SOLICITAR DOIS NUMEROS E IMPRIMIR  NUMERO MINIMO ATE NUMERO MAXIMO
 * */

fun main() {

    var numeroMaximo: Int = 0;

    var numeroMinimo: Int = 0;

    println("Informe o número minimo: ");

    numeroMinimo = readLine()!!.toInt();

    println("Informe o número máximo: ");

    numeroMaximo = readLine()!!.toInt();

    numeroMinimo++;

    numeroMaximo++;

    imprimirNumeros(numeroMinimo, numeroMaximo);

}

fun imprimirNumeros(numeroMinimo: Int, numeroMaximo: Int) {

    for(i in numeroMinimo .. numeroMaximo) {

        println(i);

    }

}
