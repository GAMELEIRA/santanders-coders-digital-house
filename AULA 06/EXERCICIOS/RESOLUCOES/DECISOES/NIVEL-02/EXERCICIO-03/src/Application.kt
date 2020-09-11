import com.sun.org.apache.xpath.internal.operations.Bool
/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 15:41
 * FINALIDADE DO PROGRAMA: REALIZAR UMA ENTREVISTA POLICIAL
 * */

fun main() {

    var pontuacao : Int = 0;

    pontuacao = fazerPerguntas();

    classificarCriminoso(pontuacao);

}

fun fazerPerguntas(): Int {

    var telefonou : Boolean = false;

    var estavaNoLocal: Boolean = false;

    var moraPertoVitima: Boolean = false;

    var deviaVitima: Boolean = false;

    var trabalhouVitima: Boolean = false;

    var classificacaoCrime: Int = 0;

    println("Telefonou para a vítima?");

    if(readLine()!!.toString().toUpperCase() == "S") {

        telefonou = true;

        classificacaoCrime++;

    }

    println("Esteve no local do crime?");

    if(readLine()!!.toString().toUpperCase() == "S") {

        estavaNoLocal = true;

        classificacaoCrime++;

    }

    println("Mora perto da vítima?");

    if(readLine()!!.toString().toUpperCase() == "S") {

        moraPertoVitima = true;

        classificacaoCrime++;

    }

    println("Devia para a vítima?");

    if(readLine()!!.toString().toUpperCase() == "S") {

        deviaVitima = true;

        classificacaoCrime++;

    }

    println("Já trabalhou com a vítima?");

    if(readLine()!!.toString().toUpperCase() == "S") {

        trabalhouVitima = true;

        classificacaoCrime++;

    }

    return classificacaoCrime;

}

fun classificarCriminoso(pontos: Int){

    when(pontos) {

        2 -> println("Suspeita!");

        3, 4 -> println("Cúmplice!");

        5 -> println("Assassino!");

        else -> println("Inocente!");

    }

}
