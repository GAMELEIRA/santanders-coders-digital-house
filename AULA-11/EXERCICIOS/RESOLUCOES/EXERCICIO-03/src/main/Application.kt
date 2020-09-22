package main

import models.Aluno

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 21/09/2020
 * HORA: 21:05
 * FINALIDADE DO PROGRAMA:
 * */

fun main () {

    val alunos: ArrayList<Aluno> = ArrayList<Aluno>();

    val novoAluno: Aluno = Aluno("Gabriel", 10);

    adicionarAlunos(4,alunos);

    println(alunos.contains(alunos));

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