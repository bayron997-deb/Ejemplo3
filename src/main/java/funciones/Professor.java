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

    //constuctores

    public Professor() {
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
