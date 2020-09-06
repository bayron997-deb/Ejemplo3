package guis;

import ejecutador.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addPerson extends JFrame {
    // Atributos
    /**
     * crear nueva ventana
     */
    protected JPanel panel;
    /**
     * ingresar nombre
     */
    protected JLabel labelIngreseNombre = new JLabel("Ingrese Nombre");
    protected JTextField textFieldname = new JTextField(10);
    /**
     * ingresar numero
     */
    protected JLabel labelPhoneNumber = new JLabel("Ingrese Numero Telefonico");
    protected JTextField textPhoneNumber = new JTextField(10);
    /**
     * ingresar email
     */
    protected JLabel labelemail = new JLabel("Ingrese email");
    protected JTextField textFieldemail = new JTextField(10);
    /**
     * ingresar calle
     */
    protected JLabel labelStreet = new JLabel("Ingrese calle");
    protected JTextField textFieldStreet = new JTextField(10);
    /**
     * ingresar ciudad
     */
    protected JLabel labelcity = new JLabel("Ingrese ciudad");
    protected JTextField textFieldcity = new JTextField(10);
    /**
     * ingresar estado
     */
    protected JLabel labelEstate = new JLabel("Ingrese Estado");
    protected JTextField textFielEstate = new JTextField(10);
    /**
     * ingresar codigo postal
     */
    protected JLabel labelPostalcode = new JLabel("Ingrese codigo postal");
    protected JTextField textFielPostalCode = new JTextField(10);
    /**
     * ingresar pais
     */
    protected JLabel labelCountry = new JLabel("Ingrese pais");
    protected JTextField textFielCountry = new JTextField(10);
    /**
     * boton guardar
     */
    protected JButton guardar = new JButton("Guardar");

    public addPerson() {

    }

    /**
     * configuraciones varias de la ventana de creacion
     */
    public void conf() {
        // La ventana inicia centrada
        setLocationRelativeTo(null);
        // cerrar ventana
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * Metodo para iniciar la ventana y agregar atributos al panel
     */
    public void iniciar() {
        //crear ventana nueva
        panel = new JPanel();
        panel.add(labelIngreseNombre);
        panel.add(textFieldname);
        panel.add(labelPhoneNumber);
        panel.add(textPhoneNumber);
        panel.add(labelemail);
        panel.add(textFieldemail);
        panel.add(labelStreet);
        panel.add(textFieldStreet);
        panel.add(labelcity);
        panel.add(textFieldcity);
        panel.add(labelEstate);
        panel.add(textFielEstate);
        panel.add(labelPostalcode);
        panel.add(textFielPostalCode);
        panel.add(labelCountry);
        panel.add(textFielCountry);
    }
}
