package main

fun main() {
    val so = ArrayList<Int>();

    do {
        var resultado = apresentaSO();
        if (resultado !== 0 && resultado >= 0 && resultado <= 6) {
            so.add(resultado);
        } else if (resultado === 0) {
            println("Bye!");
        } else {
            println("Resultado inválido!");
        }
    } while (resultado !== 0);

    calcularPercentual(so).forEach { it ->
        println("${it[0]}, ${it[1]}, ${it[2]}");
    }
}

fun apresentaSO(): Int {
    println("Qual o melhor sistema operacional para uso em servidores?");
    println("As possiveis respostas são:");
    println("1- Windows Server");
    println("2- Unix");
    println("3- Linux");
    println("4- Netware");
    println("5- Mac OS");
    println("6 Outro");
    return readLine()!!.toInt();
}

fun calcularPercentual(so: ArrayList<Int>): Array<Array<Any>> {

    val windows = arrayOf("Windows", 1500, 0);
    val unix = arrayOf("Unix", 3500, 0);
    val linux = arrayOf("Linux", 3000, 0);
    val netware = arrayOf("Netware", 500, 0);
    val macOs = arrayOf("Mac Os", 150, 0);
    val outro = arrayOf("Outro", 150, 0);

    so.forEach {
        var valorTotal = (windows[1]!!.toString().toInt() + unix[1]!!.toString().toInt() + linux[1]!!.toString().toInt()
                + netware[1]!!.toString().toInt() + macOs[1]!!.toString().toInt() + outro[1]!!.toString().toInt());

        var umPorcento = valorTotal / 100;

        when (it) {
            1 -> {
                windows[1] = windows[1]!!.toString().toInt() + 1;
                windows[2] = windows[1]!!.toString().toDouble() / umPorcento;
            };
            2 -> {
                unix[1] = unix[1]!!.toString().toInt() + 1;
                unix[2] = unix[1]!!.toString().toDouble() / umPorcento;
            }
            3 -> {
                linux[1] = linux[1]!!.toString().toInt() + 1;
                linux[2] = linux[1]!!.toString().toDouble() / umPorcento;
            };
            4 -> {
                netware[1] = netware[1]!!.toString().toInt() + 1;
                netware[2] = netware[1]!!.toString().toDouble() / umPorcento;
            };
            5 -> {
                macOs[1] = macOs[1]!!.toString().toInt() + 1;
                macOs[2] = macOs[1]!!.toString().toDouble() / umPorcento;
            };
            6 -> {
                outro[1] = outro[1]!!.toString().toInt() + 1;
                outro[2] = outro[1]!!.toString().toDouble() / umPorcento;
            };
        }
    }

    return arrayOf(windows, unix, linux, netware, macOs, outro);

}