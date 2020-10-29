package main

fun main() {
    val metros = solicitarMetros();
    val centimetros = converterMetrosEmNumeros(metros);
    exibirResultado(metros, centimetros);
}

fun solicitarMetros(): Double {
    println("Informe os metros:")
    return readLine()!!.toDouble();
}

fun converterMetrosEmNumeros(metros: Double): Double {
    return metros * 100.0;
}

fun exibirResultado (metros: Double, centimetros: Double) {
    return println("$metros metros convertido para centimetros dá $centimetros centimetros.");
}