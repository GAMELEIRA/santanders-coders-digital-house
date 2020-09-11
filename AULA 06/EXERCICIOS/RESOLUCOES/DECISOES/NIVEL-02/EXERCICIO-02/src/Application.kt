/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 09/09/2020
 * HORA: 19:42
 * FINALIDADE DO PROGRAMA: DETERMINAR SE E PAR OU IMPAR
 * */

fun main ()  {

    var numeroInteiro: Int = 0;

    var eInteiro: Boolean = false;

    var eImpar: Boolean = false

    numeroInteiro = solicitarNumero();

    eImpar = validarParImpar(numeroInteiro);

    exibirResultado(eImpar);

}

fun solicitarNumero(): Int {

    var numeroInteiro: Int = 0;

    try {

        println("Informe um número inteiro:")

        numeroInteiro = readLine()!!.toInt();

    } catch (e : Error){

        throw error("Valor informado não é um número inteiro.");

    }

    return numeroInteiro;

}

fun validarParImpar(numero: Int) : Boolean {

    var numeroInteiro : Int = 0;

    numeroInteiro = numero % 2;

    when (numeroInteiro) {

        0 -> return true;

        else -> return  false

    }

}

fun exibirResultado(eImpar : Boolean) {

    if(eImpar) {

        print("É par!");

    } else {

        print("É impar!");

    }

}
