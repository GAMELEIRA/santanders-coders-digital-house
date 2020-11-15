package models

class CachorroTeste {

    var nome: String = "";

    var cor: String = ""

    var idade: Int = 0;

    constructor(nome: String, cor: String, idade: Int) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    init {
        this.nome = "OI";
    }

}