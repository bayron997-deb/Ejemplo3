package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuColegio extends JFrame {
    // Atributos
    /**
     * Panel principal
     */
    private JPanel panel;
    /**
     * Label con el nombre del colegio
     */
    private JLabel nombrecolegio;
    /**
     * Botón para crear un profesor
     */
    private JButton botonAgregarProfesor;
    /**
     * Botón para crear un alumno
     */
    private JButton botonAgregarAlumno;
    /**
     * Botón para ver lista profesores
     */
    private JButton botonlistaprofes;
    /**
     * Botón para ver lista estudiantes
     */
    private JButton botonlistaestudiantes;
    /**
     * Botón para salir del programa
     */
    private JButton botonSalir;

    //constructor
    public menuColegio() {
        //metodo para iniciar
        iniciar();
        //diseño
        //titulo
        setTitle("colegio gestor");
        //tamaño
        setSize(600, 600);
        //inicar centrada
        setLocationRelativeTo(null);
        //cerrar ventana con la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciar() {
        panel = new JPanel();
        // Usa el BoxLayout (para mostrar los botones de arriba a abajo
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Instancia el label
        nombrecolegio = new JLabel("colegio 2");
        // Centra el nombre  (con los botones se hace lo mismo)
        nombrecolegio.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Instancia los botones
        botonAgregarAlumno = new JButton("Nuevo estudiante");
        botonAgregarAlumno.setAlignmentX(Component.CENTER_ALIGNMENT);

        botonAgregarProfesor = new JButton("Nuevo profesor");
        botonAgregarProfesor.setAlignmentX(Component.CENTER_ALIGNMENT);

        botonlistaestudiantes = new JButton("Lista de estudiantes");
        botonlistaestudiantes.setAlignmentX(Component.CENTER_ALIGNMENT);

        botonlistaprofes = new JButton("Lista de profesores");
        botonlistaprofes.setAlignmentX(Component.CENTER_ALIGNMENT);

        botonSalir = new JButton("Salir del programa");
        botonSalir.setAlignmentX(Component.CENTER_ALIGNMENT);

        //añadir botones al panel
        panel.add(nombrecolegio);
        panel.add(botonAgregarAlumno);
        panel.add(botonAgregarProfesor);
        panel.add(botonlistaestudiantes);
        panel.add(botonlistaprofes);
        panel.add(botonSalir);
        //añadir panel a la ventana
        add(panel);

        /**
         * AccionListener para agregar estudiante
         */
        botonAgregarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent addS = new addStudent();
                addS.setVisible(true);
            }
        });
        /**
         * AccionListener para agregar profesores
         */
        botonAgregarProfesor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            addProfessor addP = new addProfessor();
            addP.setVisible(true);
            }
        });
        /**
         * AccionListener para mostrar lista de estudiantes
         */
        botonlistaestudiantes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        /**
         * AccionListener para mostrar lista de profesores
         */
        botonlistaprofes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaProfe p = new listaProfe();
                p.oja();

            }
        });
        /**
         * AccionListener para sair
         */
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea el panel para pedir confirmación
                int n = JOptionPane.showConfirmDialog(panel.getParent(),
                        "¿desea salir?",
                        "Salir del programa",
                        JOptionPane.YES_NO_OPTION);
                // Si el usuario escoge "Sí"
                if (n == JOptionPane.YES_OPTION) {
                    // Sale del programa y retorna 0
                    System.exit(0);
                }
            }
        });
    }


}
