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

    public Student(String name, String numero, String email, String studentID, double averageRank, String calle, String ciudad, String estado, String codigoPostal, String pais) {
        this.averageRank = averageRank;
        this.studentID = studentID;
        this.emailAddress = email;
        this.name = name;
        this.PhoneNumber = numero;
        this.direccion.setStreet(calle);
        this.direccion.setCity(ciudad);
        this.direccion.setState(estado);
        this.direccion.setPostalCode(codigoPostal);
        this.direccion.setCountry(pais);
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

    public double getAverageRank() {
        return averageRank;
    }

    public void setAverageRank(double averageRank) {
        this.averageRank = averageRank;
    }
}
