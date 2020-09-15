package models

class JogadorFutebol constructor(var nome: String, var energia: Double,var alegria: Double, var gols: Int, var experiencia: Double) {

    fun fazergol() {

        this.energia -= 5;

        this.alegria += 10;

        this.gols += 1;

        println("GOOOOOLLL!");

    }

    fun correrJogador() {

        this.energia -= 10;

        println("Cansei!");

    }


}