package guis;

import ejecutador.Main;

public class ListaAlumno {
    public ListaAlumno() {
    }
    void verListaEstudiantes(){
        for (int i = 0; i < Main.colegio.listaProfesores.size() ; i++) {
            System.out.println(Main.colegio.listaProfesores.get(i).toString());
        }
    }
}
