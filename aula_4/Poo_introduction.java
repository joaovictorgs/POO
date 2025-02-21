package aula_4;

public class Poo_introduction {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta conta2 = new Conta();
        conta.saldo=100;
        conta2.saldo=200;
        conta.transferir(50, conta2);   
        System.out.println("conta 1: "+conta.saldo+"\nconta 2: "+conta2.saldo);     
        conta = conta2;
        System.out.println((conta==conta2) ? "é" : "n eh");
    }
}
