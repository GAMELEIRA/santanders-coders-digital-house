import kotlin.random.Random

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 12: 41
 * FINALIDADE DO PROGRAMA:
 * */

fun main () {

    var primeiroLancamento: Int = 0;

    var rolarDados: String = "";

    var continua: Boolean = false;

    println("Deseja rolar os dados?");

    rolarDados = readLine()!!.toString();

   while (rolarDados.toLowerCase() == "s"){

        do {

            primeiroLancamento = lancarDado();

            continua = validacoes(primeiroLancamento);

            if(!continua){

                break;

            }

            println("Deseja rolar os dados?");

            rolarDados = readLine()!!.toString();

        } while (continua);

       break;

    }

}


fun lancarDado(): Int {

    var numeroMinimo : Int = 2;

    var numeroMaximo: Int = 12;

   return Random.nextInt(numeroMinimo, numeroMaximo);

}

fun validacoes (numero1: Int): Boolean {

    if(numero1 == 7 || numero1 == 12) {

        println("Você é um natural! Ganhou!");

        return false;

    } else if(numero1 == 2 || numero1 == 3 || numero1 == 12) {

        println("Craps! Você perdeu!");

        return true;

    } else {

        println("Ponto!");

        return true;

    }
}