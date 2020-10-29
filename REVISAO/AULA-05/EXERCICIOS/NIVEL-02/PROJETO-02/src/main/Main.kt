package main

fun main() {
    val ganhoPorHora = solicitarQuantoGanhaPorHora();
    val horasTrabalhadas = solicitarQuantasHorasTrabalhadas();
    val salarioBruto = calcularSalarioBruto(ganhoPorHora, horasTrabalhadas);
    val ir = descontarIR(salarioBruto);
    val inss = descontarINSS(salarioBruto);
    val sindicato = descontarSindicato(salarioBruto);
    val salarioLiquido = calcularSalarioLiquido(inss, ir, sindicato, salarioBruto);
    exibirResultado(salarioBruto, salarioLiquido, ir, inss, sindicato);
}

fun solicitarQuantoGanhaPorHora(): Double {
    println("Quanto você ganha por hora?");
    return readLine()!!.toDouble();
}

fun solicitarQuantasHorasTrabalhadas(): Int {
    println("Quantas horas você trabalha?");
    return readLine()!!.toInt();
}

fun calcularSalarioBruto(ganhoPorHora: Double, horasTrabalhadas: Int): Double {
    return ganhoPorHora * horasTrabalhadas;
}

fun descontarIR(salarioBruto: Double): Double {
    return salarioBruto * 0.11;
}

fun descontarINSS(salarioBruto: Double): Double {
    return salarioBruto * 0.08;
}

fun descontarSindicato(salarioBruto: Double): Double {
    return salarioBruto * 0.05;
}

fun calcularSalarioLiquido(inss: Double, ir: Double, sindicato: Double, salarioBruto: Double): Double {
    return  salarioBruto - inss - sindicato - ir;
}

fun exibirResultado(salarioBruto: Double, salarioLiquido: Double, ir: Double, inss: Double, sindicato: Double){
    println("+ Salário Bruto: R$ $salarioBruto");
    println("- IR: R$ $ir");
    println("- INSS: R$ $inss");
    println("- Sindicato: R$ $sindicato");
    println("+ Salário Liquido: R$ $salarioLiquido");
}
