package models

class PoliciaFederal constructor(): EntidadesValidamPessoas {

    override fun validarRGPessoas(pessoa1: Pessoa, pessoa2: Pessoa): Boolean {

        return pessoa1 == pessoa2;

    }

}