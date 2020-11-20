package main

fun main() {
    var numeroMax = 0;
    var numeroAtual = 0;
    for (i in 1..5) {
        numeroAtual = informarNumero();
        if(numeroMax <= numeroAtual) {
            numeroMax = numeroAtual;
        }
    }
    println("O número máximo é ${numeroMax}");
}

fun informarNumero(): Int {
    println("Informe o número:");
    return readLine()!!.toInt();
}