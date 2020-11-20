package main

fun main () {
    println("Informe o primeiro valor:");
    var primeiroValor = readLine()!!.toInt();
    println("Informe o segundo valor:");
    var segundoValor = readLine()!!.toInt();
    for (i in primeiroValor..segundoValor){
        println(i);
    }
}

