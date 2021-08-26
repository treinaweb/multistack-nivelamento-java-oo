package br.com.treinaweb.semana2.classes;

public class Atendimento {

    private int horas;

    public void setHoras(int horas) {
        if (horas < 1 || horas > 12) {
            System.out.println("A quantidade de horas de uma atendimento não pode ser menor que 1 e nem maior que 12");
        } else {
            this.horas = horas;
        }
    }

    public int getHoras() {
        return horas;
    }

}
