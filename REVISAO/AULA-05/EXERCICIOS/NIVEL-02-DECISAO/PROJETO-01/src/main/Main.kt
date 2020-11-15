package main

fun main() {
    val valorSaque: Int = perguntarValorSaque();
    val notas: ArrayList<Int> = calcularNotas(valorSaque);
    exibirResultado(notas);
}

fun perguntarValorSaque(): Int {
    var valorSaque: Int;
    do {
        println("Informe o valor do saque: ");
        valorSaque = readLine()!!.toInt();
        if (valorSaque <= 9 || valorSaque >= 601) {
            println("Valor minimo para saque é de 10 reais.");
            println("Valor máximo para saque é de 600 reais.")
        }
    } while (valorSaque <= 9 || valorSaque >= 601);
    return valorSaque;
}

fun calcularNotas(valorSaque: Int): ArrayList<Int> {
    var NOTAS_CEM = 0;
    var NOTAS_CINQUENTA = 0;
    var NOTAS_DEZ = 0;
    var NOTAS_CINCO = 0;
    var NOTAS_UM = 0;
    var valor = valorSaque;
    if (valorSaque >= 100) {
        do {
            valor -= 100;
            NOTAS_CEM++;
        } while (valor >= 100);
    }

    if (valor >= 50) {
        do {
            valor -= 50;
            NOTAS_CINQUENTA++;
        } while (valor >= 50);
    }

    if (valor >= 10) {
        do {
            valor -= 10;
            NOTAS_DEZ++;
        } while (valor >= 10);
    }

    if (valor >= 5) {
        do {
            valor -= 5;
            NOTAS_CINCO++;
        } while (valor >= 10);
    }

    if (valor >= 1) {
        do {
            valor -= 1;
            NOTAS_UM++;
        } while (valor >= 1);
    }

    val notas = ArrayList<Int>();
    notas.add(NOTAS_CEM);
    notas.add(NOTAS_CINQUENTA);
    notas.add(NOTAS_DEZ);
    notas.add(NOTAS_CINCO);
    notas.add(NOTAS_UM);
    return notas;
}

fun exibirResultado(notas: ArrayList<Int>) {
    println("Notas de 100 reais ${notas[0]}");
    println("Notas de 50 reais ${notas[1]}");
    println("Notas de 10 reais ${notas[2]}");
    println("Notas de 5 reais ${notas[3]}");
    println("Notas de 1 real ${notas[4]}");
}