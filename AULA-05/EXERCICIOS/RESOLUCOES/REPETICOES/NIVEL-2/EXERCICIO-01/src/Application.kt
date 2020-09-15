/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 12:24
 * FINALIDADE DO PROGRAMA: LER N NOTAS
 * */

fun main () {

    var quantidadeNotas : Int = 0;

    var media : Double = 0.0;

    var totalNotas : Double = 0.0;

    quantidadeNotas = solicitarQuantidadeNotas();

    totalNotas = informarNotas(quantidadeNotas);

    media = calcularMedia(quantidadeNotas, totalNotas);

    exibirResultado(media);

}

fun solicitarQuantidadeNotas(): Int {

    var quantidadeNotas: Int = 0;

    println("Informe a quantidade de notas: ");

    quantidadeNotas = readLine()!!.toInt();

    return quantidadeNotas;

}

fun informarNotas(quantidadeNotas: Int): Double  {

    var valorTotalNotas = 0.0;

    for(i in 1 .. quantidadeNotas) {

        println("Informe a nota ${i}")

       valorTotalNotas +=  readLine()!!.toDouble();

    }

    return valorTotalNotas;

}

fun calcularMedia(quantidadeNotas: Int, totalNotas: Double) : Double {

    return totalNotas / quantidadeNotas;

}

fun exibirResultado(media: Double)  {

    println("A média de notas é ${media}");

}