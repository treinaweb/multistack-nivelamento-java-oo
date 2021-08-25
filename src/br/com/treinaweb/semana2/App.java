package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Cliente;
import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista("João da Silva", "(11) 99877-7777", "Av Paulista, 1220", "123");

        System.out.println("Nome: " + diarista.nome);
        System.out.println("Telefone: " + diarista.telefone);
        System.out.println("Endereço: " + diarista.endereco);
        System.out.println("Chave Pix: " + diarista.chavePix);
        diarista.atender("Cleyson");

        var cliente = new Cliente("Maria da Silva", "(11) 99877-7777", "Av Paulista, 1221", 1000.0);
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Telefone: " + cliente.telefone);
        System.out.println("Endereço: " + cliente.endereco);
        System.out.println("Saldo: " + cliente.saldo);
    }
}