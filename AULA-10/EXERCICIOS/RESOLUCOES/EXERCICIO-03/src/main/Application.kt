package main

import models.Estoque

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 18/09/2020
 * HORA: 22:38
 * FINALIDADE DO PROGRAMA: SIMULAR UM PROGRAMA DE ESTOQUE
 * */

fun main() {

    val estoque = Estoque("Meu estoque", 15, 2);

    estoque.darBaixa(20);

    println(estoque.toString());

}