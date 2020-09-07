package guis;

import ejecutador.main;

import javax.swing.*;

public class listaProfe {
    //Atributos
    public listaProfe(){

    }
    public void oja(){
        for (int i = 0; i < main.colegio.listaProfesores.size() ; i++) {
            System.out.println(main.colegio.listaProfesores.get(i).toString());
        }
    }
}
