
fun main(){

    val numeros = listOf("UM", "DOIS","TRES");

    try {

        println(numeros.get(3));

    } catch (ex: ArrayIndexOutOfBoundsException) {

        println("Array Excedido!");

    } catch (ex: Exception) {

        println("Erro");

    }
}

