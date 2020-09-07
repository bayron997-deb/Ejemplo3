package guis;

import ejecutador.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends AddPerson {
    // Atributos
    /**
     * ingresar studentID
     */
    private JLabel jLabelstudentID = new JLabel("ingrese identificacion de estudiante");
    private JTextField textFieldstudentId = new JTextField(10);
    /**
     * ingresar promedio
     */
    private JLabel jLabelaverageRank = new JLabel("ingrese salario");
    private JTextField textFieldaverageRank = new JTextField(10);

    //constructor
    public AddStudent() {
        iniciar();
        //caracterizticas varias de la ventana
        setTitle("Nuevo profesor");
        setSize(200, 600);
        conf();
    }

    public void iniciar() {
        super.iniciar();
        //añadir botones al panel
        panel.add(jLabelstudentID);
        panel.add(textFieldstudentId);
        panel.add(jLabelaverageRank);
        panel.add(textFieldaverageRank);
        panel.add(guardar);
        //añadir panel a la ventana
        add(panel);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colegio.nuevoEstudiante(textFieldname.getText(), textPhoneNumber.getText(), textFieldemail.getText(), textFieldstudentId.getText(),Double.parseDouble(textFieldaverageRank.getText()), textFieldStreet.getText(), textFieldcity.getText(), textFieldStreet.getText(), textFielPostalCode.getText(), textFielCountry.getText());
                //setear texto
                textFieldname.setText("");
                textPhoneNumber.setText("");
                textFieldemail.setText("");
                textFieldstudentId.setText("");
                textFieldaverageRank.setText("");
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
