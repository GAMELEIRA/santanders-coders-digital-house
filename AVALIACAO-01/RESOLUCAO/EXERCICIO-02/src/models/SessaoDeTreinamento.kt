package models

class SessaoDeTreinamento constructor(){

    var experiencia: Double = 0.0;

    fun treinarA(jogador: JogadorFutebol) {

        println("Experiência antes do treino: ${jogador.experiencia}")

        jogador.correrJogador();

        jogador.fazergol();

        jogador.correrJogador();

        this.experiencia++;

        println("Experiência depois do treino: ${this.experiencia + jogador.experiencia}")

    }
}