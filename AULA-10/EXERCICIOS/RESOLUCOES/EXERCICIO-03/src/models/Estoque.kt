package models

class Estoque constructor(var nome: String,var quantidadeAtual: Int, var quantidadeMinima: Int) {

    public fun mudarNome(nome: String){

        this.nome = nome;

    }

    public fun mudarQtdMinima(quantidadeMinima: Int){

        if(quantidadeMinima >= 0) {

            this.quantidadeMinima = quantidadeMinima;

        }

    }

    public fun repor(quantidade: Int) {

        if (quantidade >= 0) {

            this.quantidadeAtual += quantidade;

        }

    }

    public fun darBaixa(quantidade: Int) {

        if (quantidadeAtual >= quantidade) {

            this.quantidadeAtual -= quantidade;

        }

    }

    override fun toString(): String {

        return "Estoque(nome='$nome', quantidadeAtual=$quantidadeAtual, quantidadeMinima=$quantidadeMinima)"

    }

    fun precisaRepor() : Boolean {

        if(this.quantidadeAtual <= this.quantidadeMinima){

            return true;

        }

            return false;

    }

}