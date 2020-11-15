package models

class Cachorro (val nome: String = "", val cor: String = "", var idade: Int = 0) {

    constructor(nome: String): this(nome, "", 0) {

    }

}