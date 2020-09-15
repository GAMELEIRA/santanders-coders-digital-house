/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 16:36
 * FINALIDADE DO PROGRAMA:VALIDAR A DIFERENCA ENTRE STRINGS
 * */

fun main() {

    val textos: ArrayList<String> = solicitarCadeiaTextos();

    var numerosIguais: String = "";

    numerosIguais = validarIgualdade(textos);

    println(numerosIguais);

}

fun solicitarCadeiaTextos() : ArrayList<String> {

    val textos: ArrayList<String> = ArrayList<String>();

    for (i in 1.. 2) {

        println("Informe uma string: ");

        textos.add(readLine()!!.toString());

    }

    return textos;

}

fun validarIgualdade(textos: ArrayList<String>) = textos.reduce{acc, texto -> if (acc == texto) "Igual" else "Diferente";}