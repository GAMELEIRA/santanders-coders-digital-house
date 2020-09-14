/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 18:20
 * FINALIDADE DO PROGRAMA:
 * */

fun main() {

    solicitarAltura();

}

fun solicitarAltura() {

    var altura: Double = 0.0;

    println("Informe a altura: ");

    altura = readLine()!!.toDouble();

    calcularImc(altura);

}

fun calcularImc(altura: Double) {

    var pesoIdealHomens: Double = 0.0;

    var pesoIdealMulher: Double = 0.0;

    pesoIdealHomens = 72.7 * altura - 58;

    pesoIdealMulher = 62.1 * altura - 44.7;

    exibirImcIdeal(pesoIdealHomens, pesoIdealMulher);

}

fun exibirImcIdeal(pesoIdealHomens: Double, pesoIdealMulher: Double) {

    println("Para homens: $pesoIdealHomens. Para mulheres: $pesoIdealMulher");

}