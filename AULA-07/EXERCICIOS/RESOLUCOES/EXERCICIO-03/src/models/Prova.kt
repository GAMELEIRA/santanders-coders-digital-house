package models

class Prova constructor(var dificuldade: Double, var energiaNecessaria: Double) {

    fun realizarProva(atleta: Atleta): Boolean {

        if (atleta.energia >= energiaNecessaria && atleta.nivel >= dificuldade) {

            println("Atleta hápto! Realizou a prova");

            println("Atleta com energia ${atleta.energia}");

            atleta.energia -= energiaNecessaria;

            return true;

        }

        println("Atleta não hápto!");

        return false;

    }

}
