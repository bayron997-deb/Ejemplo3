package guis;

import javax.swing.*;

public class addProfessor extends addPerson {
    //Atributos
    /**
     * ingresar salario
     */
    private JTextField textFielsalario;

    //constructor
    public addProfessor() {
        iniciar();
        //caracterizticas varias de la ventana
        setTitle("Nuevo profesor");
        setSize(300, 200);
        conf();
    }
    public void iniciar(){
super.iniciar();

    }
}
