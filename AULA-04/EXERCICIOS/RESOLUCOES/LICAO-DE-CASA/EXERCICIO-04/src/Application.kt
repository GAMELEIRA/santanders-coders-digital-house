/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 14/09/2020
 * HORA: 18:54
 * FINALIDADE DO PROGRAMA: CALCULAR A QUANTIDADE PESCADA DE PEIXES
 * */

fun main() {

    var peso: Double = solicitarPeso();

    var quantidadeExcedida: Double =  calcularExcesso(peso);

    var valorMulta: Double = calcularCustoExcedente(peso);

    println("Excedeu "+ quantidadeExcedida);

    println("O valor a  ser pago: " + calcularCustoExcedente(peso));

}

fun solicitarPeso(): Double {

    var quantidadePescada: Double = 0.0;

    println("Informe a quantidade que pescou:")

    quantidadePescada = readLine()!!.toDouble();

    return quantidadePescada;
}

fun validarPeso (peso: Double) = if (peso > 50.0) true else false;

fun calcularCustoExcedente(peso: Double) = (peso - 50) * 4;

fun calcularExcesso(peso : Double) = peso - 50;