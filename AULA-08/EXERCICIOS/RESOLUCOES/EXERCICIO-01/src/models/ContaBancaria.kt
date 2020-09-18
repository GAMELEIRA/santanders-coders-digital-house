package models

public abstract class ContaBancaria (public val numeroConta: Int, protected var saldo: Double){

    public abstract fun sacar(valor: Double) : Boolean;

    public abstract fun depositar(valor: Double);

    public abstract fun transferir(valor: Double, conta: ContaBancaria);

}