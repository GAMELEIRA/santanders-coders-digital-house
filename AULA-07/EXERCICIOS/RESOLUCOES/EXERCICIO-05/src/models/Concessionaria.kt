package models

class Concessionaria constructor(var nome: String) {

    var vendas: ArrayList<Venda> = ArrayList<Venda>();

    fun registrarVenda( venda: Venda){

        this.vendas.add(venda);

        println("Venda finalizada!");

    }

}