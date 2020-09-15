package models

class Carro constructor(var consumoPorKilometro: Double) {

    var combustivelTanque: Double = 0.0;

    fun andar() {

        if (this.combustivelTanque >= consumoPorKilometro) {

            this.combustivelTanque -= consumoPorKilometro;

            println("Rodando com ${this.combustivelTanque} litros de gasolina!")

        } else {

            println("Sem gasolina!");

        }

    }

    fun obterGasolina(): Double {

       return this.combustivelTanque;

    }

    fun adicionarGasolina(gasolina: Double) {

        this.combustivelTanque += gasolina;

    }

}