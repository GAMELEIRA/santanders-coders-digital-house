package main

import models.JogadorFutebol
import models.SessaoDeTreinamento

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 21: 34
 * FINALIDADE DO PROGRAMA: SIMULAR O TREINO DE JOGADORES DE FUTEBOL
 */

fun main() {

    val neymar = JogadorFutebol("Neymar", 100.0, 100.0, 0, 100.0);

    val messi = JogadorFutebol("Messi", 100.0, 100.0, 0, 100.0);

    val sessaoTreinamentoNeymar = SessaoDeTreinamento();

    val sessaoDeTreinamentoMessi = SessaoDeTreinamento();

    sessaoTreinamentoNeymar.treinarA(neymar);

    sessaoDeTreinamentoMessi.treinarA(messi);

}