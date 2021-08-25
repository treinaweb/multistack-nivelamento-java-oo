package br.com.treinaweb.semana2.classes;

public class Diarista {

    public String nome;

    public String telefone;

    public String endereco;

    public Diarista(String nome) {
        this.nome = nome;
    }

    public Diarista(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void atender(String nomeCliente) {
        System.out.println("Realizando atendimento para cliente " + nomeCliente);
    }

}
