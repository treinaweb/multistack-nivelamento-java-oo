package br.com.treinaweb.semana2.classes;

import br.com.treinaweb.semana2.interfaces.ISaldo;

public abstract class Pessoa implements ISaldo {

    private String nome;

    private String telefone;

    private String endereco;

    private double saldo;

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSaldo() {
      return saldo;
    }

    public void transferir(ISaldo obj, double valor) {
        this.sacar(valor);
        obj.depositar(valor);
    }

    protected void setSaldo(double saldo) {
      this.saldo = saldo;
    }

}
