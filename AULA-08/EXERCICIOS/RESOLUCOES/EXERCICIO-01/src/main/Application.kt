package main

import models.ContaCorrente
import models.ContaPoupanca
import models.Relatorio

fun main () {

    val contaCorrente: ContaCorrente = ContaCorrente(10.0, 10010, 10000.00);

    val contaPoupanca: ContaPoupanca = ContaPoupanca(101010, 66666.00);

    val relatorio: Relatorio = Relatorio();

    contaCorrente.depositar(50000.00);

    contaPoupanca.depositar(8888855555.00);

    contaCorrente.sacar(10.10);

    contaPoupanca.sacar(666.00);

    relatorio.gerarRelatorio(contaCorrente);

    relatorio.gerarRelatorio(contaPoupanca);

}