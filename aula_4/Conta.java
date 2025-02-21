package aula_4;


public class Conta {
    String nome;
    int limite;
    public int saldo;
    int numeroDaConta;

    void sacar(int valorSaque){
        saldo -= valorSaque;
    }
    void depositar(int valorDeposito){
        saldo+=valorDeposito;
    }

    void transferir(int valor, Conta conta){
        conta.saldo+=valor;
        saldo-=valor;
    }
}
