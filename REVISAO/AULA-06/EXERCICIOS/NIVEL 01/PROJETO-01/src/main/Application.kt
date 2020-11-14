package main

fun main() {
    val numerosInteiros = arrayOfNulls<Int>(5);

    for(l in 0..4){
        println("Indice $l")
        numerosInteiros[l] = informarNumeros();
    }
    mostrarResultados(numerosInteiros)
}

fun informarNumeros(): Int {
    println("Informar número:");
    return readLine()!!.toInt();
}

fun mostrarResultados(numerosInteiros: Array<Int?>) {
    for (n in 0..numerosInteiros.size - 1) {
        println(numerosInteiros[n]);
    }
}