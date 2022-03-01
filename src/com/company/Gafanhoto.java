package com.company;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); //super pela superclasse
        this.login = login;
        this.totAssistido = 0 ;

    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" +login + super.toString()+
                 + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
