package funciones;

/**
 * Esta clase posee atributos para identificar a un o varios profesores
 */
public class Professor extends Person {
    //atributos

    /**
     * salario profesor
     */
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    //constuctores
    public Professor(String name, String numero, String email, String salario) {
        this.name =name;
        this.PhoneNumber= numero;
        this.emailAddress = email;
        this.salario = salario;
    }


}
