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

    //metodos
    public void nuevoProfesor(String name, String phoneNumber, String emailAddress, String salary) {
        Professor nuevo = new Professor(name,phoneNumber,emailAddress,salary);
        listaProfesores.add(nuevo);



    }

}
