package funciones;

/**
 * tiene atributos de un estudiante
 */
public class Student extends Person {
    //Atributos

    /**
     * ID del estudiante
     */
    private String studentID;
    /**
     * promedio notas
     */
    private double averageRank;
    //constructores

    public Student() {
    }

    //metodos

    /**
     * ver si puede inscribirse
     */
    public Boolean isEligibleToRoll() {
        return true;
    }

    /**
     * seminarios de estudiante
     */
    public void setSeminarsTaken() {

    }
}
