package main

import models.Cachorro
import models.CachorroTeste

fun main() {
    var cachorro: Cachorro = Cachorro("Gabriel", "Pardo", 21);
    println(cachorro.nome);
    var cachorroUm: Cachorro = Cachorro("Gameleira");
    println(cachorroUm.nome);
}
