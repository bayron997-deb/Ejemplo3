package funciones;

import java.util.ArrayList;
import java.util.List;

/**
 * esta clase administrara los estudiantes y los profesores
 */
public class colegio {
    /**
     * arraylist de profesores
     */
    private List<Professor> listaProfesores = new ArrayList<Professor>();
    /**
     * arraylist de estudiantes
     */
    private List<Student> listaEstudiantes = new ArrayList<Student>();

    //constructores

    public colegio() {
    }

    /**
     * Metodo que se encarga de añadir un nuevo profesor a la lista de profesores
     */
    //metodos
    public void nuevoProfesor(String name, String numero, String email, String salario, String calle , String ciudad , String estado, String codigoPostal, String pais) {
        Professor nuevo = new Professor(name,numero,email,salario,calle,ciudad,estado,codigoPostal,pais);
        listaProfesores.add(nuevo);
    }

    /**
     * Metodo que se encarga de añadir un nuevo estudiante a la lista
     */
    public void nuevoEstudiante(String name, String numero, String email, String studentID, String averageRank, String calle, String ciudad, String estado, String codigoPostal, String pais) {
        Student nuevo = new Student(name, numero, email, studentID, averageRank, calle,ciudad,estado,codigoPostal,pais);
        listaEstudiantes.add(nuevo);
    }

    /**
     * lista para ver profesores
     */
    public void verprofesores() {
        for (int i = 0; i <listaProfesores.size() ; i++) {
            System.out.println(listaProfesores.get(i).toString());
        }
    }
    /**
     * lista para ver estudiantes
     */
    public void verestudiantes(){
        for (int i = 0; i <listaEstudiantes.size() ; i++) {
            System.out.println(listaEstudiantes.get(i).toString());
        }
    }

}
