



fun main() {

    println(somaImposto(10.0, 100.0));

}

fun somaImposto(taxaImposto: Double, custo: Double) : Double {

    var custoAvaliado : Double = custo;

    custoAvaliado += custo * taxaImposto;

    return custoAvaliado ;

}