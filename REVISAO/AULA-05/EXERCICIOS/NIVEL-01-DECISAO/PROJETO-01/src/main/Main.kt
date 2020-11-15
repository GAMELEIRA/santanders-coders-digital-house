package main

fun main() {
    var sexo: String = perguntarSexo();
    validarSexo(sexo);
}

fun perguntarSexo(): String {
    println("Qual o seu sexo?");
    return readLine()!!.toString().toLowerCase();
}

fun validarSexo(sexo: String) {
    when (sexo) {
        "f" -> println("Feminino");
        "m" -> println("Masculino");
        else -> println("Sexo inválido");
    }
}