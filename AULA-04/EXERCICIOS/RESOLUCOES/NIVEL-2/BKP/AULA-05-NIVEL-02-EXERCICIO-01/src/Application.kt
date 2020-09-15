/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 02/09/2020
 * HORA: 22: 11
 * FINALIDADE DO PROGRAMA: CALCULAR A TEMPERATURA EM FAHRENHEIT PARA CELSIUS
 * */

fun main() {

    var grausFahrenheit: Double = 0.0;

    var grausCelsius: Double = 0.0;

    grausFahrenheit = solicitarLeituraFahrenheit();

    grausCelsius = calcularTemperaturaFahrenheitParaCelsius(grausFahrenheit);

    exibirResultado(grausCelsius);
}

fun solicitarLeituraFahrenheit (): Double {

    var temperaturaEmGrausFahrenheit: Double = 0.0;

    println("Insira um valor número real que informe a temperatura em Fahrenheit");

    temperaturaEmGrausFahrenheit = readLine()!!.toDouble();

    return temperaturaEmGrausFahrenheit;

}


fun calcularTemperaturaFahrenheitParaCelsius(graus: Double): Double {

    var resultado: Double = 0.0;

    resultado = 5 * ((graus - 32) / 9);

    return resultado;

}

fun exibirResultado(grausCelsius: Double){

    println("Resultado: " + grausCelsius );

}