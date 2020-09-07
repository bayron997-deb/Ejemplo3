package guis;

import ejecutador.Main;

public class ListaProfe {
    //Atributos
    public ListaProfe(){

    }
     void verListaProfes(){
        for (int i = 0; i < Main.colegio.listaProfesores.size() ; i++) {
            System.out.println(Main.colegio.listaProfesores.get(i).toString());
        }
    }
}
