package guis;

import ejecutador.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addProfessor extends addPerson {
    //Atributos
    /**
     * ingresar salario
     */
    private JButton jButtonsalario = new JButton("ingrese salario");
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
        //añadir botones al panel
        panel.add(jButtonsalario);
        panel.add(textFielsalario);
        //añadir panel a la ventana
        add(panel);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                main.colegio.nuevoProfesor(textFieldname.getText(), textPhoneNumber.getText(), textFieldemail.getText(), textFielsalario.getText(), textFieldStreet.getText(), textFieldcity.getText(), textFieldStreet.getText(), textFielPostalCode.getText(), textFielCountry.getText());
                //setear texto
                textFieldname.setText("");
                textPhoneNumber.setText("");
                textFieldemail.setText("");
                textFielsalario.setText("");
                textFieldStreet.setText("");
                textFieldcity.setText("");
                textFieldStreet.setText("");
                textFielPostalCode.setText("");
                textFielCountry.setText("");
                //cerrar
                dispose();
            }
        });
    }
}
