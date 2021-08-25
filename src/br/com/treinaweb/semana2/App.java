package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var joao = new Diarista();
        joao.nome = "João da Silva";
        joao.telefone = "(11) 99877-7777";
        joao.endereco = "Av Paulista, 1220";

        System.out.println("Nome: " + joao.nome);
        System.out.println("Telefone: " + joao.telefone);
        System.out.println("Endereço: " + joao.endereco);
        joao.atender("Cleyson");

        var maria = new Diarista();
        maria.nome = "Maria da Silva";
        maria.telefone = "(11) 9877-7777";
        maria.endereco = "Av Paulista, 1221";

        System.out.println("Nome: " + maria.nome);
        System.out.println("Telefone: " + maria.telefone);
        System.out.println("Endereço: " + maria.endereco);
        maria.atender("Elton");
    }
}