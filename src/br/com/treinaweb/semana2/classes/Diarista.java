package br.com.treinaweb.semana2.classes;

public class Diarista extends Pessoa {

    private String chavePix;

    public Diarista(String nome) {
        super(nome, null, null);
    }

    public Diarista(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }

    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para cliente " + nomeCliente);
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void sacar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
    }

    @Override
    public void depositar(double valor) {
        var saldoAtual = this.getSaldo();
        var novoSaldo = saldoAtual + valor;
        this.setSaldo(novoSaldo);
    }

}
