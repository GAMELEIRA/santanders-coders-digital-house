/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 06/09/2020
 * HORA: 22: 29
 * FINALIDADE DO PROGRAMA: CALCULAR IMPOSTOS QUE SERAO DESCONTADOS DO SALARIO
 * */

fun main() {

    var impostoDeRenda: Double = 0.11;

    var inss: Double = 0.08;

    var sindicato: Double = 0.05;

    var salarioPorHora: Double = 0.0;

    var horasTrabalhadas: Double = 0.0;

    var salarioBruto: Double = 0.0;

    var salarioLiquidoPorMes: Double = 0.0;

    var quantoDescontadoImpostoDeRenda : Double = 0.0;

    var quantoDescontadoInss:Double = 0.0;

    var quandoDescontadoSindicato: Double = 0.0;

    var descontoTotal: Double = 0.0;

    salarioPorHora = solicitarSalarioPorHora();

    horasTrabalhadas = solicitarHorasTrabaladas();

    salarioBruto = calcularSalarioBruto(salarioPorHora, horasTrabalhadas);

    quantoDescontadoImpostoDeRenda = calcularGastoComImpostoDeRenda(salarioBruto, impostoDeRenda);

    quantoDescontadoInss = calcularGastoComInss(salarioBruto, inss);

    quandoDescontadoSindicato = calcularGastoComSindicato(salarioBruto, sindicato);

    descontoTotal = quantoDescontadoImpostoDeRenda + quantoDescontadoInss + quandoDescontadoSindicato;

    salarioLiquidoPorMes = calcularSalarioLiquido(salarioBruto, descontoTotal);

    exibirFolha(salarioBruto, salarioLiquidoPorMes, quantoDescontadoImpostoDeRenda, quantoDescontadoInss , quandoDescontadoSindicato)

}

fun solicitarSalarioPorHora() : Double {

    var salarioPorHora : Double = 0.0;

    println("Quanto você ganha de salário  por hora? ")

    salarioPorHora = readLine()!!.toDouble();

    return salarioPorHora;

}

fun solicitarHorasTrabaladas() : Double {

    var horasTrabalhadas: Double = 0.0;

    println("Quantas horas você trabalha por mês?")

    horasTrabalhadas = readLine()!!.toDouble();

    return horasTrabalhadas;

}

fun calcularSalarioBruto(horasTrabalhadas: Double, salarioPorHora: Double): Double {

    return horasTrabalhadas * salarioPorHora;

}

fun  calcularGastoComImpostoDeRenda (salarioBruto: Double, impostoDeRenda : Double) : Double {

    return salarioBruto * impostoDeRenda;

}

fun calcularGastoComInss(salarioBruto: Double, inss : Double) : Double {

    return  salarioBruto * inss;

}

fun calcularGastoComSindicato(salarioBruto: Double, sindicato: Double) : Double {

    return salarioBruto * sindicato;

}


fun calcularSalarioLiquido(salarioBr3 uto: Double, descontoTotal: Double): Double {

    return salarioBruto - descontoTotal;

}

fun exibirFolha (salarioBruto: Double, salarioLiquido: Double, gastoComImpostoRenda : Double, gastoComInss: Double, gastoComSindicato: Double){

    println("Salário Bruto: ${salarioBruto}");

    println("Imposto de Renda: ${gastoComImpostoRenda}");

    println("INSS: ${gastoComInss}");

    println("Sindicato: ${gastoComSindicato}");

    println("Salário Liquido: ${salarioLiquido}");

}

