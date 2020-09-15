/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 12:24
 * FINALIDADE DO PROGRAMA: CALCULAR A MEDIA DE N CDS
 * */

fun main() {

    var valorTotalInvestido : Double = 0.0;

    var quantidadeCds: Int = 0;

    var valorMedioPagoPorCd: Double = 0.0;

    quantidadeCds = solicitarQuantidadeCDS();

    valorTotalInvestido = informarValorInvestidoEmCds(quantidadeCds);

    valorMedioPagoPorCd = calcularMedia(quantidadeCds, valorTotalInvestido);

    exibirResultado(valorMedioPagoPorCd);

}

fun solicitarQuantidadeCDS(): Int {

    var quantidadeCdsLidas : Int = 0;

    println("Informe a quantidade de CDS que deverão ser lidas: ");

    quantidadeCdsLidas = readLine()!!.toInt();

    return  quantidadeCdsLidas;

}

fun informarValorInvestidoEmCds(quantidadeCds: Int): Double  {

    var valorTotalInvestidoCds = 0.0;

    for(i in 1 .. quantidadeCds) {

        println("Informe o valor no CD ${i}")

        valorTotalInvestidoCds +=  readLine()!!.toDouble();

    }

    return valorTotalInvestidoCds;

}

fun calcularMedia(quantidadeCds: Int, valorTotalInvestido: Double) : Double {

    return valorTotalInvestido / quantidadeCds;

}

fun exibirResultado(media: Double)  {

    println("A média de investimento em cds é de ${media}");

}