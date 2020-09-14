/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 16:38
 * FINALIDADE DO PROGRAMA: IDENTIFICAR SE UM NUMERO E IMPAR OU PAR
 * */

fun main() {

    var numero : Int = 0;

    var ePar : Boolean = false;

    numero = solicitarNumero();

    ePar = validarPar(numero);

    exibirResultado(ePar);
}

fun solicitarNumero(): Int {

    var numero: Int = 0;

    println("Informe o número inteiro que será avaliado:");

    numero = readLine()!!.toInt();

    return numero;

}

fun validarPar (numero:Int) = if(numero % 2 == 0) true else false;

fun exibirResultado(ePar: Boolean) = if(ePar) println("É par!") else println("É impar!");