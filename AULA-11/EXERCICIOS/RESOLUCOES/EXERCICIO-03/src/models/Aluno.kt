package models

class Aluno(private var nome: String, private var numeroAluno: Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Aluno

        if (numeroAluno != other.numeroAluno) return false

        return true
    }

    override fun hashCode(): Int {
        return numeroAluno
    }
}