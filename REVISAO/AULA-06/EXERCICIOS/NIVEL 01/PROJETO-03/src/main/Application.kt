package main

fun main () {
    val numerosInteiros = arrayOfNulls<Double>(5);
    for(l in 0..4){
        numerosInteiros[l] = informarAltura();
    }
    mostrarResultadosInvertidos(numerosInteiros);
}

fun informarAltura(): Double {
    println("Informar altura:");
    return readLine()!!.toDouble();
}

fun mostrarResultadosInvertidos(numerosInteiros: Array<Double?>) {
    numerosInteiros.reverse();
    for (n in 0..numerosInteiros.size - 1) {
        println(numerosInteiros[n]);
    }
}