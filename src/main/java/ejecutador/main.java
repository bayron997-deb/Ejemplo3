package ejecutador;

import guis.menuColegio;
import funciones.colegio;

/**
 * Clase que ejecutara el programa completo
 *
 * @author Bayron
 */


public class main {


    public static colegio colegio = new colegio();


    public static void main(String[] args) {
        menuColegio v = new menuColegio();
        v.setVisible(true);
    }
}

