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
    public Professor(String name, String numero, String email, String salario, String calle , String ciudad , String estado, String codigoPostal, String pais) {
        this.name =name;
        this.PhoneNumber= numero;
        this.emailAddress = email;
        this.salario = salario;
        this.direccion.setStreet(calle);
        this.direccion.setCity(ciudad);
        this.direccion.setState(estado);
        this.direccion.setPostalCode(codigoPostal);
        this.direccion.setCountry(pais);
    }


}
