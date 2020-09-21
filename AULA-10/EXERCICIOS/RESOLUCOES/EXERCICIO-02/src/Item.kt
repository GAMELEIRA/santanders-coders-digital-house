class Item(var numeroItemFaturado: Int) {

    constructor(numeroItemFaturado: Int, descricaoItem: Int, quantCompradaItem: Int, precoUnitarioItem: Double):this (numeroItemFaturado){

        this.numeroItemFaturado = numeroItemFaturado;

        this.descricaoItem = descricaoItem;

        this.quantCompradaItem = quantCompradaItem;

        this.precoUnitarioItem = precoUnitarioItem;

    }

}