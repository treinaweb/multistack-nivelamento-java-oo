package br.com.treinaweb.semana2.classes;

public class Diarista extends Pessoa {

    public String chavePix;

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

}
