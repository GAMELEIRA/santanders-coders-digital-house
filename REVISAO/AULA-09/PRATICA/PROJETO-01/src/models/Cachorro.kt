package models

class Cachorro(raca: String): Animal(raca) {
    override fun correr() {
        println("OI")
    }
}