package main

fun main() {
    var multiplicando = 0;
    println("Informe o multiplicando:")
    multiplicando = readLine()!!.toInt();
    for(i in 1..10) {
       println("${multiplicando} x ${i} = ${multiplicando * i}");
    }
}