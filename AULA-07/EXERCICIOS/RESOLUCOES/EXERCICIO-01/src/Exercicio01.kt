import models.Cliente
import models.Conta

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 20:15
 * FINALIDADE DO PROGRAMA:
 * */

fun main () {

    val gabriel = Cliente("Gabriel","Gameleira");

    val ingrid = Cliente("Ingrid", "Barros");

    val contaGabriel = Conta(gabriel,101010 , 1000.0);

    val contaIngrid = Conta(ingrid, 52555, 555.55);

    contaGabriel.deposito(1000.0);

    contaGabriel.saque(1111.0);

    contaIngrid.deposito(70000.0);

    contaIngrid.saque(9999.8);

}