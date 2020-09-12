fun main() {

    var nome : String = "";

    var idade : Int = 0;

    var salario: Double = 0.0;

    var sexo: String = "";

    var estadoCivil: String = "";

    var n = 0;

    do {

        println("Informe um nome: ")

        nome = readLine()!!.toString();

    } while (3 > nome.length);

    do {

        println("Informe uma idade entre 0 e 150: ")

        idade = readLine()!!.toInt();

    } while ((idade >= 0) && (idade <= 150));

    do {

        println("Informe um salário maior que zero: ")

        salario = readLine()!!.toDouble();

    } while (salario < 0);

    do {

        println("Informe um salário maior que zero: ")

        salario = readLine()!!.toDouble();

    } while (salario < 0);

    do {

        println("Informe o sexo F para Feminino e M para Masculino:  ")

        sexo = (readLine()!!.toString()).toUpperCase();

    } while (sexo == "F" || sexo == "M");

    do {

        println("Informe o estado civil: s para Solteiro, c para Casado, v para Viuvo, d para Divorciado");

        estadoCivil = (readLine()!!.toString()).toUpperCase();

    } while (estadoCivil == "S" || estadoCivil == "C" || estadoCivil == "V" || estadoCivil == "D");

}