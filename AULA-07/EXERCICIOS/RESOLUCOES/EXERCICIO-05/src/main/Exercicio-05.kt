package main

import com.sun.security.ntlm.Client
import models.Carro
import models.Cliente
import models.Concessionaria
import models.Venda

fun main() {

    var cliente: Cliente = Cliente("Gabriel", "Gameleira", "111111111");

    var carro: Carro = Carro("Ferrari", "XXX", 2020, "Vermelho", 1000.0);

    var concessionaria: Concessionaria = Concessionaria("Test");

    var venda = Venda(1111.0, carro, cliente);

    concessionaria.registrarVenda(venda);

}