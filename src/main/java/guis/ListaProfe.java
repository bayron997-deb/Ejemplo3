package guis;



public class ListaProfe {
    //Atributos
    public ListaProfe(){

    }
     void verListaProfes(){
        for (int i = 0; i < AddPerson.colegio.listaProfesores.size() ; i++) {
            System.out.println(AddPerson.colegio.listaProfesores.get(i).toString());
        }
    }
}
