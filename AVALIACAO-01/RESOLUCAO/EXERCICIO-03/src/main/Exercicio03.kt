package main

import models.Atleta
import models.Prova

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 18:09
 * FINALIDADE DO PROGRAMA: SIMULAR A PROVA DE ATLETISMO
 * */

fun main() {

    var atleta1 = Atleta("Balotelli", 100.0,100.0);

    var atleta2 = Atleta("Serena Willians", 100.0, 100.0);

    var prova1Atleta1 = Prova(10.0, 10.0);

    prova1Atleta1.realizarProva(atleta1);

    var prova2Atleta1 = Prova(10.0, 10.0);

    prova2Atleta1.realizarProva(atleta1);

    var prova3Atleta1 = Prova(10.0, 10.0);

    prova3Atleta1.realizarProva(atleta1);

    var prova1Atleta2 = Prova(10.0, 10.0);

    prova1Atleta2.realizarProva(atleta2);

    var prova2Atleta2 = Prova(10.0, 10.0);

    prova2Atleta2.realizarProva(atleta2);

    var prova3Atleta2 = Prova(10.0, 10.0);

    prova3Atleta2.realizarProva(atleta2);

}