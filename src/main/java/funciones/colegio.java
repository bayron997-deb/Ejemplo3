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
    List<Professor> listaProfesores = new ArrayList<Professor>();
    /**
     * arraylist de estudiantes
     */
    List<Student> listaEstudiantes = new ArrayList<Student>();

    //constructores

    public colegio() {
    }

    /**
     * Metodo que se encarga de añadir un nuevo profesor a la lista de profesores
     */
    //metodos
    public void nuevoProfesor(String name, String numero, String email, String salario, String calle , String ciudad , String estado, String codigoPostal, String pais) {
        Professor nuevo = new Professor(name,numero,email,salario,calle,ciudad,estado,codigoPostal,pais);
        nuevo.setName(name);
        nuevo.setPhoneNumber(numero);
        nuevo.setSalario(salario);
        nuevo.setEmailAddress(email);
        nuevo.direccion.setStreet(calle);
        nuevo.direccion.setCity(ciudad);
        nuevo.direccion.setState(estado);
        nuevo.direccion.setPostalCode(codigoPostal);
        nuevo.direccion.setCountry(pais);
        listaProfesores.add(nuevo);
    }

    /**
     * Metodo que se encarga de añadir un nuevo estudiante a la lista
     */
    public void nuevoEstudiante(String name, String numero, String email, String studentID, String averageRank, String calle, String ciudad, String estado, String codigoPostal, String pais) {
        Student nuevo = new Student(name, numero, email, studentID, averageRank, calle,ciudad,estado,codigoPostal,pais);
        nuevo.setName(name);
        nuevo.setPhoneNumber(numero);
        nuevo.setStudentID(studentID);
        nuevo.setAverageRank(averageRank);
        nuevo.setEmailAddress(email);
        nuevo.direccion.setStreet(calle);
        nuevo.direccion.setCity(ciudad);
        nuevo.direccion.setState(estado);
        nuevo.direccion.setPostalCode(codigoPostal);
        nuevo.direccion.setCountry(pais);
        listaEstudiantes.add(nuevo);
    }

}
