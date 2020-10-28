package main

fun main() {

    val loteriaDosSonhos = mapOf<Int, String>(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista", 5 to "Fogo");

    val apelidosAmigos: Any = mapOf<String, ArrayList<String>>("João" to arrayListOf<String>("Juan", "Fissura", "Maromba"),
        "Miguel" to arrayListOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to arrayListOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to arrayListOf("Lukinha", "Jorge", "George") );

    loteriaDosSonhos.forEach {

        println(``);

    }


}

