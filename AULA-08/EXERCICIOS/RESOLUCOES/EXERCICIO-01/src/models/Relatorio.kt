package models

import interfaces.Imprimivel

public class Relatorio {

    public fun gerarRelatorio(imprimivel: Imprimivel) {

        imprimivel.mostrarDados();

    }

}