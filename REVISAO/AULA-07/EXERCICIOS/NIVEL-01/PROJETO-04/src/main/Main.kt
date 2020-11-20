package main

fun main() {
    val nome = solicitarNome();
    val idade = solicitarIdade();
    val salario = solicitarSalario();
    val sexo = solicitarSexo();
    val estadoCivil = solicitarEstadoCivil();
}

fun solicitarNome(): String {
    val NOME_MAIOR_TRES = 3
    var nome = "";
    do {
        println("Informe o nome com mais de 3 caracteres:");
        nome = readLine()!!.toString();
    } while (NOME_MAIOR_TRES >= nome.length);
    return nome;
}

fun solicitarIdade(): Int {
    var idade = 0;
    val IDADE_MINIMA = 0;
    val IDADE_MAXIMA = 151;
    do {
        println("Informe uma idade entre 0 e 150");
        idade = readLine()!!.toInt();
    } while (idade <= IDADE_MINIMA || idade >= IDADE_MAXIMA);
    return idade;
}

fun solicitarSalario(): Double {
    val SALARIO_MINIMO = 0;
    var salario = 0.0;
    do {
        println("Informe o salário maior que 0:");
        salario = readLine()!!.toDouble();
    } while (salario < SALARIO_MINIMO);
    return salario;
}

fun solicitarSexo(): String {
    val SEXO_FEM: String = "F";
    val SEXO_MASC: String = "M";
    var sexo = "";
    do {
        println("Informe se é macho (m) ou femea (f)");
        sexo = readLine()!!.toString().toUpperCase();
    } while (sexo != SEXO_FEM && sexo != SEXO_MASC);
    return sexo;
}

fun solicitarEstadoCivil(): String {0
    val SOLTEIRO: String = "S";
    val CASADO: String = "C";
    val VIUVO: String = "V";
    val DIVORCIADO: String = "D";
    var estadoCivil = "";
    do {
        println("Informe o estado civil");
        println("S para SOLTEIRO");
        println("C para CASADOS");
        println("V para VIUVOS");
        println("D para DIVORCIADOS");
        estadoCivil = readLine()!!.toString().toUpperCase();
    } while (estadoCivil != SOLTEIRO && estadoCivil != CASADO && estadoCivil != VIUVO && estadoCivil != DIVORCIADO);
    return estadoCivil;
}
