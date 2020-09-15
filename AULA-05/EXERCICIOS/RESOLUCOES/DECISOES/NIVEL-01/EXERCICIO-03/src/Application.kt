/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 14:21
 * FINALIDADE DO PROGRAMA: VALIDAR A NOTA DOS ALUNOS
 * */

fun main () {

    var nota1: Double = 0.0;

    var nota2: Double = 0.0;

    var media: Double = 0.0;

    println("Informe a primeira nota:");

    nota1 = readLine()!!.toDouble();

    println("Informe a segunda nota:");

    nota2 = readLine()!!.toDouble();

    media = calcularMedia(nota1, nota2);

    validarAprovacao(media);

}

fun calcularMedia(nota1 : Double, nota2 : Double) : Double {

    var notasSomadas : Double = 0.0;

    var media : Double = 0.0;

    notasSomadas = nota1 + nota2;

    media = notasSomadas / 2;

    return media;

}

fun validarAprovacao(media: Double) {

    if (media == 10.0) {

        println("Aprovado com distinção!");

    } else if(media < 7) {

        println("Reprovado!");

    } else {

        println("Aprovado!");

    }

}