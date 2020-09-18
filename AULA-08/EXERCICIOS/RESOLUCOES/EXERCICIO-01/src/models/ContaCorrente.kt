package models

import interfaces.Imprimivel

public class ContaCorrente(private val taxaOperecao: Double, numeroConta: Int, saldo: Double): ContaBancaria(numeroConta, saldo), Imprimivel {

    override fun mostrarDados() {

        println("A sua taxa de operação é:${this.taxaOperecao}");

    }

    override fun sacar(valor: Double): Boolean {

        val valorTotal: Double = this.taxaOperecao + valor;

        if(valorTotal <= this.saldo) {

            this.saldo -= valorTotal;

            return true;

        }

        return false;

    }

    override fun depositar(valor: Double) {

        if((valor - this.saldo) >= 0) {

            this.saldo += valor;

        }

    }

    override fun transferir(valor: Double, conta: ContaBancaria) {

        if (this.sacar(valor)) {

            conta.depositar(valor);

            println("Transferência realizada!");

        } else {

            println("Tranferência negada!");

        }

    }

}