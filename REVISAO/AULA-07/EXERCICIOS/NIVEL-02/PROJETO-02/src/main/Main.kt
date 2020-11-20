package main

fun main() {
    var valorTotal = 0.0;
    var contador = 0;
    var vai: Boolean = false;
    do {
        println("Informe o valor:")
        valorTotal += readLine()!!.toDouble();
        println("Deseja continuar inserindo cds?");
        vai = readLine()!!.toBoolean();
        contador++;
    } while (vai);
    println("Média por CD ${valorTotal / contador}");
    println("Valor total ${valorTotal}")
}