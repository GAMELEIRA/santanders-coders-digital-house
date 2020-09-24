package main

import models.Aluno

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 21/09/2020
 * HORA: 21:05
 * FINALIDADE DO PROGRAMA:
 * */

fun main () {

    val alunos: ArrayList<Aluno> = ArrayList()

    val novoAluno = Aluno("G", 10);

    adicionarAlunos(4,alunos);

    println(alunos.contains(novoAluno));

}

fun adicionarAlunos(quantidade: Int, alunos: ArrayList<Aluno>) {

    var nome: String;

    var numeroAluno: Int;

    for(i in 1 .. quantidade) {

        println("Informe o nome do aluno:")

        nome = readLine()!!.toString();

        println("Informe o número do aluno:")

        numeroAluno = readLine()!!.toInt();

        alunos.add(Aluno(nome, numeroAluno));

    }

}

/**fun main() {
    val listaDeAlunos = arrayListOf<Aluno>()
    listaDeAlunos.add(Aluno("Aluno 1", 1))
    listaDeAlunos.add(Aluno("Aluno 2", 2))
    listaDeAlunos.add(Aluno("Aluno 3", 3))
    listaDeAlunos.add(Aluno("Aluno 4", 4))
    val alunoNovo = Aluno("Aluno novo", 2)
    println(listaDeAlunos.contains(alunoNovo))
}*/