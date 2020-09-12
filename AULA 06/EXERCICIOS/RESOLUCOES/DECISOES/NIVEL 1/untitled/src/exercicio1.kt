import kotlin.math.max

fun main() {

    var numero: Int = 0;

    var auxiliar: Int = 0;

    for(n in 1..5) {

        println("Informe o número ${n}");

        numero = readLine()!!.toInt();

        //O NUMERO E IGUAL OU MAIOR QUE A AUXILIAR
        auxiliar =  max(numero, auxiliar)

    }

    println(auxiliar);

}