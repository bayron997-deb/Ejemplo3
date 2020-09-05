package guis;

import javax.swing.*;

public class addPerson extends JFrame{
    // Atributos
    /**
     * crear nueva ventana
     */
    protected JPanel panel;
    /**
     * nombre del programa
     */
    protected JLabel labelIngreseNombre;
    /**
     *  ingresar nombre
     */
    protected JTextField textFieldname;
    /**
     *  ingresar numero
     */
    protected JTextField textPhoneNumber;
    /**
     * ingresar email
     */
    protected JTextField textFieldemail;
    /**
     *  ingresar calle
     */
    protected JTextField textFieldStreet;
    /**
     *  ingresar ciudad
     */
    protected JTextField textPhoneCiudad;
    /**
     * ingresar estado
     */
    protected JTextField textFielEstado;
    /**
     * ingresar codigo postal
     */
    protected JTextField textFielPostalCode;
    /**
     * ingresar pais
     */
    protected JTextField textFielCountry;
    /**
     * boton guardar
     */
    protected JButton guardar;
    /**
     * configuraciones varias de la ventana de creacion
     */
    public addPerson(){

    }
    public void conf(){
        // La ventana inicia centrada
        setLocationRelativeTo(null);
        // cerrar ventana
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
