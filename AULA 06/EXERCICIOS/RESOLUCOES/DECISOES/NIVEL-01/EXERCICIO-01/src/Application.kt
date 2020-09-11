/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 11/09/2020
 * HORA: 13: 45
 * FINALIDADE DO PROGRAMA: VALIDAR O SEXO DA PESSOA
 * */

fun main() {

    var sexo : String = "";

    var sexoValidado: String = "";

    sexo = solicitarSexo();

    sexoValidado = validarSexo(sexo);

    exibirResultado(sexoValidado);

}

fun solicitarSexo(): String {

    var letraInformada: String = "";

    print("Informe o sexo. Para feminino digite F para masculino digite M.");

    letraInformada = readLine()!!.toString();

    return letraInformada;

}

fun validarSexo(sexo: String): String {

    if(sexo.toUpperCase() == "M") {

        return "Masculino";

    } else if (sexo.toUpperCase() == "F"){

        return "Feminino";

    } else {

        return "Sexo inválido";

    }

}

fun exibirResultado(sexo: String) {

    println("Sexo informado é: $sexo");

}