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
    public void nuevoProfesor(String name, String phoneNumber, String emailAddress, String salary) {
        Professor nuevo = new Professor(name, phoneNumber, emailAddress, salary);
        listaProfesores.add(nuevo);
    }

    /**
     * Metodo que se encarga de añadir un nuevo estudiante a la lista
     */
    public void nuevoEstudiante(String name, String numero, String email, String studentID, double averageRank) {
        Student nuevo = new Student(name, numero, email, studentID, averageRank);
        listaEstudiantes.add(nuevo);
    }

    /**
     * lista para ver profesores
     */
    public void verprofesores() {

    }
    /**
     * lista para ver estudiantes
     */
    public void verestudiantes(){

    }

}
