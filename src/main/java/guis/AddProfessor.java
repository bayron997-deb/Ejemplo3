package guis;

import ejecutador.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProfessor extends AddPerson {
    //Atributos
    /**
     * ingresar salario
     */
    private JLabel jButtonsalario = new JLabel("ingrese salario");
    private JTextField textFielsalario = new JTextField(10);

    //constructor
    public AddProfessor() {
        iniciar();
        //caracterizticas varias de la ventana
        setTitle("Nuevo profesor");
        setSize(200, 600);
        conf();
    }

    public void iniciar() {
        super.iniciar();
        //añadir botones al panel
        panel.add(jButtonsalario);
        panel.add(textFielsalario);
        panel.add(guardar);
        //añadir panel a la ventana
        add(panel);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.colegio.nuevoProfesor(textFieldname.getText(), textPhoneNumber.getText(), textFieldemail.getText(), textFielsalario.getText(), textFieldStreet.getText(), textFieldcity.getText(), textFieldStreet.getText(), textFielPostalCode.getText(), textFielCountry.getText());
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
