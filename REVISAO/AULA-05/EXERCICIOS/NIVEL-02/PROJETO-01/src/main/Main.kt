package main

fun main() {
    val temperaturaFahrenheit = solitaGrausFahrenheit();
    val temperaturaCelsius = converterGrausFahrenheitEmCelsius(temperaturaFahrenheit);
    exibirGrausCelsiusEFahrenheit(temperaturaFahrenheit, temperaturaCelsius);
}

fun solitaGrausFahrenheit(): Double {
    println("Informe a temperatura em Fahrenheit");
    return readLine()!!.toDouble();
}

fun converterGrausFahrenheitEmCelsius(grausFahrenheit: Double): Double {
    return 5 * ((grausFahrenheit - 32) / 9);
}

fun exibirGrausCelsiusEFahrenheit(grausFahrenheit: Double, grausCelsius: Double) {
    println("$grausCelsius celsius convertido para fahrenheit é ${grausFahrenheit}");
}