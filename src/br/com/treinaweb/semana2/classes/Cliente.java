package br.com.treinaweb.semana2.classes;

public class Cliente extends Pessoa {

    private double saldo;

    public Cliente(String nome, String telefone, String endereco, double saldo) {
        super(nome, telefone, endereco);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
