package main

fun main() {
    val nvSuspeito: Int = fazerPerguntas();
    classificarSuspeito(nvSuspeito);
}

fun fazerPerguntas(): Int {
    var nvSuspeito: Int = 0;
    var resposta: String = "";
    println("Telefonou para a vítima?");
    resposta = readLine()!!.toString().toUpperCase();
    if (resposta == "S") {
        nvSuspeito++;
    }
    println("Esteve no local do crime?");
    resposta = readLine()!!.toString().toUpperCase();
    if (resposta == "S") {
        nvSuspeito++;
    }
    println("Mora perto da vítima?");
    resposta = readLine()!!.toString();
    if (resposta.toUpperCase() == "S") {
        nvSuspeito++;
    }
    println("Devia para a vítima?");
    resposta = readLine()!!.toString().toUpperCase();
    if (resposta == "S") {
        nvSuspeito++;
    }
    println("Já trabalhou com a vítima?");
    resposta = readLine()!!.toString().toUpperCase();
    if (resposta == "S") {
        nvSuspeito++;
    }
    return nvSuspeito;
}

fun classificarSuspeito(nvSuspeito: Int) {
    when (nvSuspeito) {
        5 -> println("Assassino");
        4, 3 -> println("Cúmplice");
        2 -> println("Suspeita");
        1 -> println("Inocente");
    }
}