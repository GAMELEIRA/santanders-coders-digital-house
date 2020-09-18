package models

import interfaces.Imprimivel

class Banco: Imprimivel {

    val contasBancarias: ArrayList<ContaBancaria> = ArrayList();

    public fun inserir(conta: ContaBancaria) {}

    public fun remover(conta: ContaBancaria) {}

    public fun procurarConta(numeroContaBancaria: Int): ContaBancaria? {

        contasBancarias.forEach {

            if (numeroContaBancaria == it.numeroConta) {

                return it;

            }

        }

        return null;

    }

    override fun mostrarDados() {


        contasBancarias.forEach {

            println("Número da conta: ${it.numeroConta}");

            println("Número : ${it.}");

            println("Número da conta: ${it.numeroConta}");

        }



    }

}
