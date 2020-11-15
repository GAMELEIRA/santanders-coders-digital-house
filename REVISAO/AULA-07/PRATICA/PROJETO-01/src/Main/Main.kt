package Main

fun main(){
    val corDoSemafaro = "Bugou Geral";

    if(corDoSemafaro.equals("verde")) {
        println("Siga!")
    } else if (corDoSemafaro.equals("vermelho")) {
        println("Pare!");
    } else if (corDoSemafaro.equals("amarelo")) {
        println("Atenção pare");
    }

    val nome = "Felipe"

    when(nome) {
        "André" -> println("É ele! André");
        "Felipe" -> println("É ele! Felipe");
    }

    for(l in 4 downTo 1 step 1) {
        println(l);
    }

}