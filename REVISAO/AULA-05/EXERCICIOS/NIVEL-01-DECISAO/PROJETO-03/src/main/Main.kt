package main

fun main() {
    val notas = arrayListOf<Double>();
    for (i in 0..1) {
        notas.add(solicitarNota());
    }
    exibirMensagem(calcularMedia(notas));
}

fun solicitarNota(): Double {
    println("Informe a nota:");
    return readLine()!!.toDouble();
}

fun calcularMedia(notas: ArrayList<Double>): Double {
    val media: Double;
    var total: Double = 0.0;
    for (i in (notas.size - 1) downTo 0) {
        total += notas[i];
    }
    return total / notas.size;
}

fun exibirMensagem(media: Double) {
    if (media === 10.0) {
        println("Aprovado com Distinção. Média igual a $media");
    } else if (media >= 7.0) {
        println("Aprovado. Média igual a $media");
    } else {
        println("Reprovado. Média igual a $media");
    }
}