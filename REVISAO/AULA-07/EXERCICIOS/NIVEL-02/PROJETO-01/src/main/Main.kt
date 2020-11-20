package main

fun main() {
    var notasTotal = 0.0;
    var contador = 0;
    var vai: Boolean = false;
    do {
        println("Informe a nota:")
        notasTotal += readLine()!!.toDouble();
        println("Deseja continuar inserindo notas?");
        vai = readLine()!!.toBoolean();
        contador++;
    } while (vai);
    println("Média ${notasTotal / contador}");
}