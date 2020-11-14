fun main() {
    val limite = informarLimitePeixes();
    val valorMulta = informarValorMulta();
    val quantidadeAtualPeixes = informarQuantidadeAtual();
    val excesso = calcularExcesso(quantidadeAtualPeixes, limite);
    val multa = calcularMulta(valorMulta, excesso);
    exibirResultado(excesso, multa);
}

fun informarLimitePeixes(): Double {
    println("Informe o limite de peixes:");
    return readLine()!!.toDouble();
}

fun informarQuantidadeAtual(): Double {
    println("Informe a quanitidade de peixes atual: ");
    return readLine()!!.toDouble();
}

fun informarValorMulta(): Double {
    println("Informe o valor da multa: ");
    return readLine()!!.toDouble();
}

fun calcularExcesso(quantidadeAtual: Double, quantidadeMaxima: Double) = quantidadeAtual - quantidadeMaxima;

fun calcularMulta(valorMulta: Double, quantidadeAtual: Double): Double {
    if (quantidadeAtual >= 0) {
        return valorMulta * quantidadeAtual
    } else {
        return 0.0;
    }
}

fun exibirResultado(excesso: Double, valorPago: Double) {
    println("Excedeu $excesso");
    println("O valor a ser pago é de R$ $valorPago");
}