package models

class Conta constructor(val cliente: Cliente,  val numeroConta: Int, var saldo: Double) {

    fun deposito(quantia: Double) {

        println("Realizando o deposito.")

        this.saldo += quantia;

        println("Deposito realizado!");

        println("Saldo: $ ${this.saldo}");

    }

    fun saque(quantia: Double) {

        if(saldo >= quantia) {

            println("Realizando o saque.")

            this.saldo -= quantia;

            println("Saque realizado!");

            println("Saldo: $ ${this.saldo}");

        } else {

            println("Saldo insuficiente! ");

            println("Saldo: $ ${this.saldo}");

        }

    }


}