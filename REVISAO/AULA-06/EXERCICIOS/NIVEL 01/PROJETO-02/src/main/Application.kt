package main

fun main () {
    val numerosInteiros = arrayOfNulls<Int>(10);
    for(l in 0..9){
        numerosInteiros[l] = informarNumeros();
    }
    mostrarResultadosInvertidos(numerosInteiros);
}

fun informarNumeros(): Int {
    println("Informar número:");
    return readLine()!!.toInt();
}

fun mostrarResultadosInvertidos(numerosInteiros: Array<Int?>) {
    numerosInteiros.reverse();
    for (n in 0..numerosInteiros.size - 1) {
        println(numerosInteiros[n]);
    }
}