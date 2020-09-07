package guis;

import ejecutador.Main;

public class ListaAlumno {
    public ListaAlumno() {
    }
    void verListaEstudiantes(){
        for (int i = 0; i < AddPerson.colegio.listaProfesores.size() ; i++) {
            System.out.println(AddPerson.colegio.listaProfesores.get(i).toString());
        }
    }
}
