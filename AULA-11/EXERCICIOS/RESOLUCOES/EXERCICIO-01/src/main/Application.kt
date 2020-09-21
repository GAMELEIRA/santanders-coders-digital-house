package main

import models.Pessoa
import models.PoliciaFederal

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 21/09/2020
 * HORA: 20:45
 * FINALIDADE DO PROGRAMA: PROGRAMA QUE REALIZA A OPERACAO DE VALIDACAO DE RGS
 * */

fun main()  {

    val pessoa1 = Pessoa("Gameleira", "963410447");

    val pessoa2 = Pessoa("Gameleira", "963410447");

    val policiaFederal = PoliciaFederal();

    exibirPessoa(pessoa1);

    exibirPessoa(pessoa2);

    exibirValidacaoRg(policiaFederal.validarRGPessoas(pessoa1, pessoa2));

}

fun exibirPessoa(pessoa: Pessoa) {

    println(pessoa.toString());

}

fun exibirValidacaoRg(igual: Boolean) {

    println(igual);

}