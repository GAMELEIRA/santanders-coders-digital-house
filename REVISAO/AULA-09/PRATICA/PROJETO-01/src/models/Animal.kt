package models

 abstract class Animal (val raca: String) {

    var idade = 0;

    constructor(raca: String, idade: Int): this(raca) {
        this.idade = idade;
    }

    constructor(idade: Int): this("") {
        this.idade = idade;
    }


    open fun correr() {}

}