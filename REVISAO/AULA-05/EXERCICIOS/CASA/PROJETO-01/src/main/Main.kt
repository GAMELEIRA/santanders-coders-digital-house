package main

fun main () {
    val primeiraNota = solicitarNota();
    val segundaNota = solicitarNota();
    val terceiraNota = solicitarNota();
    val quartaNota = solicitarNota();
    val media = calcularMedia(primeiraNota, segundaNota, terceiraNota, quartaNota);
    exibirResultado(media);
}

fun solicitarNota(): Double {
    println("Informe uma nota");
    return readLine()!!.toDouble();
}

fun calcularMedia(primeiraNota: Double, segundaNota: Double, terceiraNota: Double, quartaNota: Double): Double {
    return (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
}

fun exibirResultado(media: Double) {
    println(" A média é $media");
}