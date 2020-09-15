package main

import models.Carro

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 22:35
 * FINALIDADE DO PROGRAMA: SIMULAR O CONSUMO DE UM CARRO VIAJANTE
 * */

fun main () {

    var ferrari = Carro(15.0);

    ferrari.adicionarGasolina(20.0);

    ferrari.andar();

    println(ferrari.obterGasolina());

}