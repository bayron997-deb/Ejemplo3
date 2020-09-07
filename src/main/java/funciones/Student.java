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
    private String averageRank;
    //constructores

    public Student(String name, String numero, String email, String studentID, String averageRank) {
        this.averageRank = averageRank;
        this.studentID = studentID;
        this.emailAddress = email;
        this.name = name;
        this.PhoneNumber = numero;
        this.direccion.getStreet();
        this.direccion.getCity();
        this.direccion.getState();
        this.direccion.getPostalCode();
        this.direccion.getCountry();
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

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getAverageRank() {
        return averageRank;
    }

    public void setAverageRank(String averageRank) {
        this.averageRank = averageRank;
    }
    /**
     * Formato salida
     */
    @Override
    public String toString() {
    return super.toString()+" studentID: "+studentID+", Promedio: "+averageRank;
    }
}
