package guis;

import javax.swing.*;
import java.awt.event.ActionListener;

public class addProfessor extends addPerson {
    //Atributos
    /**
     * ingresar salario
     */
    private  JButton jButtonsalario = new JButton("ingrese salario");
    private JTextField textFielsalario = new JTextField(10);

    //constructor
    public addProfessor() {
        iniciar();
        //caracterizticas varias de la ventana
        setTitle("Nuevo profesor");
        setSize(300, 200);
        conf();
    }

    public void iniciar() {
        super.iniciar();
        panel.add(jButtonsalario);
        panel.add(textFielsalario);
        add(panel);
    }
}
