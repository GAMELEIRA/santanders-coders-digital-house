import kotlin.math.max

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 09:39
 * FINALIDADE DO PROGRAMA: FAZER UM PROGRAMA QUE LEIA 5 NUMEROS E INFORME O MAIOR NUMERO
 * */

fun main() {

    var quantidadeRepeticoes: Int = 5;

    var numeroMaior : Int = 0;

    numeroMaior = repetirSolicitacao(quantidadeRepeticoes);

    exibirResultado(numeroMaior);

}

fun repetirSolicitacao(quantidadesRepeticoes: Int) : Int{

    var numeroInformado: Int = 0;

    var numeroMaior: Int = 0;

    for(i in 1 .. quantidadesRepeticoes) {

        if (i == 1 ) {

            numeroMaior = solicitarNumero(i);

            continue;

        }

        numeroInformado = solicitarNumero(i);

        numeroMaior = validarNumero(numeroMaior, numeroInformado);

    }

    return numeroMaior;

}


fun solicitarNumero(contador: Int) : Int {

    var numeroInformado: Int = 0;

    print("Olá! Informe o número ${contador}: ");

    numeroInformado = readLine()!!.toInt();

    return numeroInformado;

}

fun validarNumero (numeroAntigo: Int, numeroAtual: Int) : Int {

    return max(numeroAntigo, numeroAtual);

}

fun exibirResultado (numero: Int) {

    println("O maior número é: $numero");

}
