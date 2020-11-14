package main

fun main() {
    val salHora = perguntarQuantoGanhaPorHora();
    val horasTrabalhadas = perguntarQuantasHorasTrabalhou();
    val salMes = calcularSalario(salHora, horasTrabalhadas);
    apresentarSalario(salMes);
}

fun perguntarQuantoGanhaPorHora(): Double {
    println("Quanto você ganha por hora?");
    return readLine()!!.toDouble();
}

fun perguntarQuantasHorasTrabalhou(): Int {
    println("Quantas horas você trabalha?");
    return  readLine()!!.toInt();
}

fun calcularSalario(salario: Double, horas: Int) = salario * horas;

fun apresentarSalario(salarioTotal: Double) {
    println("Você receberá R$ $salarioTotal");
}