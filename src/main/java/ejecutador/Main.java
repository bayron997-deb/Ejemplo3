package ejecutador;

import guis.MenuColegio;
import funciones.colegio;

/**
 * Clase que ejecutara el programa completo
 *
 * @author Bayron
 */


public class Main {


    public static colegio colegio = new colegio();


    public static void main(String[] args) {
        MenuColegio v = new MenuColegio();
        v.setVisible(true);
    }
}

