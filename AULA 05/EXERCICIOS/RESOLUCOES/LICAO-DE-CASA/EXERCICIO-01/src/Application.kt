/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 17:39
 * FINALIDADE DO PROGRAMA: INFORMAR A MEDIA DE ALUNOS
 * */

fun main() {

    val notas : ArrayList<Double> = solicitarNotasBimestrais();

    var media : Double = 0.0;

    media = calcularMedia(notas);

    exibirMedia(media);

}

fun solicitarNotasBimestrais(): ArrayList<Double> {

    val notas : ArrayList<Double> = ArrayList<Double>();

    for(i in 1.. 4) {

        println("Informe a nota do Bimestre $i: ");

        notas.add(readLine()!!.toDouble());

    }

    return notas;

}

fun calcularMedia(numeros: ArrayList<Double>) : Double {

    var num: Double = 0.0;

    numeros.forEach { it

        num += it;

    }

    return num / numeros.size;

}

fun exibirMedia(media: Double) {

    println("Sua média é: $media");

}

