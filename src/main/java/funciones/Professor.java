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
    public Professor(String name1, String numero1, String email1, String s, String calle, String name, String numero, String email, String salario){
        this.name =name;
        this.PhoneNumber= numero;
        this.emailAddress = email;
        this.salario = salario;
        this.direccion.getStreet();
        this.direccion.getCity();
        this.direccion.getState();
        this.direccion.getPostalCode();
        this.direccion.getCountry();
    }
    /**
     * Formato salida
     */
    @Override
    public String toString() {
        return super.toString()+" salario: "+salario+direccion.toString();
    }
}
