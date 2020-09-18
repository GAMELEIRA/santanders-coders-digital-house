package models

import interfaces.Imprimivel

class ContaPoupanca(numeroConta: Int, saldo: Double) : ContaBancaria(numeroConta, saldo), Imprimivel {

    private var limiteCredito: Double = 0.0;

    override fun mostrarDados() {

        println("O seu limite de crédito é: ${this.limiteCredito}");

    }

    override fun sacar(valor: Double): Boolean {

        if (this.saldo >= 0) {

            if ((this.limiteCredito + saldo) >= valor) {

                this.saldo -= valor;

                return true;

            }

        }

        return false;

    }

    override fun depositar(valor: Double) {

        this.saldo += valor;

    }

    override fun transferir(valor: Double, conta: ContaBancaria) {

        if(sacar(valor)){

            conta.depositar(valor);

            println("Transferencia realizada!");

        } else {

            println("Transferência negada!");

        }

    }

}

