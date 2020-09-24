package main

import models.Estado
import models.Pessoa

fun main() {

    val estado1 = Estado("SP", "São Paulo");

    val estado2 = Estado("BA", "BAHIA");

    val estado3 = Estado("RJ", "Rio de Janeiro");

    val estado4 = Estado("MG", "Minas Gerais");

    val estado5 = Estado("RS", "Rio Grande do Sul");

    val estado6 = Estado("SC", "Santa Catarina");

    val pessoa1 = Pessoa("Gabriel", estado1);

    val pessoa2 = Pessoa("Fernanda", estado2);

    val pessoa3 = Pessoa("Gioanna", estado3);

    val pessoa4 = Pessoa("Joice", estado4);

    val pessoa5 = Pessoa("Gabriel", estado1);

    val pessoa6 = Pessoa("Fernanda", estado2);

    val pessoa7 = Pessoa("Gioanna", estado3);

    val pessoa8 = Pessoa("Joice", estado4);

    val pessoa9 = Pessoa("Gabriel", estado5);

    val pessoa10 = Pessoa("Fernanda", estado5);

    val pessoa11 = Pessoa("Gioanna", estado6);

    val pessoa12 = Pessoa("Joice", estado6);

    val pessoas = listOf<Pessoa>(
        pessoa1,
        pessoa2,
        pessoa3,
        pessoa4,
        pessoa5,
        pessoa6,
        pessoa7,
        pessoa8,
        pessoa9,
        pessoa10,
        pessoa11,
        pessoa12
    );

    val agruparPessoaPorEstado = mutableMapOf<String, MutableList<Pessoa>>()

    val pessoasDeSp = ArrayList<Pessoa>();

    val pessoasDaBA = ArrayList<Pessoa>();

    val pessoasDoRj = ArrayList<Pessoa>();

    val pessoasDeMg = ArrayList<Pessoa>();

    val pessoasDoRs = ArrayList<Pessoa>();

    val pessoasDeSc = ArrayList<Pessoa>();

    println(pessoas.groupBy { it.estado.sigla });

}