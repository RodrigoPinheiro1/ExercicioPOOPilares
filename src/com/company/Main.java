package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Video v [] = new Video[3];


        v[0] = new Video("Aula 1 de POO");
<<<<<<< HEAD
   v[1] = new Video("Aula 12 de phptestepara subior");

     
        v[2] = new Video("Aula de .net");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("jubileu",22, "M" ,"JUBA");
        g[1] = new Gafanhoto("creuza",33, "F" ,"creu");

        Visualizacao visualizacao= new Visualizacao(g[0], v[2]);


        visualizacao.avaliar(35.04f);

        System.out.println(visualizacao.toString());
/*

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());*/


        System.out.println(visualizacao.toString());
    }
}
