package br.com.treinaweb.semana2;

import br.com.treinaweb.semana2.classes.Atendimento;
import br.com.treinaweb.semana2.classes.Cliente;
import br.com.treinaweb.semana2.classes.Diarista;

public class App {
    public static void main(String[] args) {
        var diarista = new Diarista("João da Silva", "(11) 99877-7777", "Av Paulista, 1220", "123");

        System.out.println("Nome: " + diarista.getNome());
        System.out.println("Telefone: " + diarista.getTelefone());
        System.out.println("Endereço: " + diarista.getEndereco());
        System.out.println("Chave Pix: " + diarista.getChavePix());
        diarista.atender("Cleyson");

        var cliente = new Cliente("Maria da Silva", "(11) 99877-7777", "Av Paulista, 1221", 1000.0);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Saldo: " + cliente.getSaldo());

        var atendimento = new Atendimento();
        atendimento.setHoras(6);
        System.out.println(atendimento.getHoras());
    }
}