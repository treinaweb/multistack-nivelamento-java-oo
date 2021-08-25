package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var joao = new Diarista("João da Silva", "(11) 99877-7777", "Av Paulista, 1220");

        System.out.println("Nome: " + joao.nome);
        System.out.println("Telefone: " + joao.telefone);
        System.out.println("Endereço: " + joao.endereco);
        joao.atender("Cleyson");

        var maria = new Diarista("Maria da Silva", "(11) 99877-7777", "Av Paulista, 1221");

        System.out.println("Nome: " + maria.nome);
        System.out.println("Telefone: " + maria.telefone);
        System.out.println("Endereço: " + maria.endereco);
        maria.atender("Elton");

        var luis = new Diarista("Luis da Silva");
        System.out.println("Nome: " + luis.nome);
        System.out.println("Telefone: " + luis.telefone);
        System.out.println("Endereço: " + luis.endereco);
    }
}