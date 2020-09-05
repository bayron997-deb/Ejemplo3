package funciones;

/**
 * tiene atributos de tipo persona
 */

public class Person {
    protected Address direccion = new Address();
    //Atributos
    /**
     * nombre persona
     */
    protected String name;
    /**
     * numero persona
     */
    protected String PhoneNumber;
    /**
     * email persona
     */
    protected String emailAddress;

    //constructores

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    /**
     * formato salida
     */
    @Override
    public String toString() {
        return "nombre: "+name+", numero: "+PhoneNumber+", email: "+emailAddress;
    }
}
