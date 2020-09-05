package funciones;

/**
 * Esta clase es para identificar donde residiran las personas adjuntas a esta direccion
 */

public class Address {
    //Atributos

    /**
     * calle persona
     */
    private String street;
    /**
     * ciudad persona
     */
    private String city;
    /**
     * estado persona
     */
    private String state;
    /**
     * codigo postal  persona
     */
    private String postalCode;
    /**
     * pais persona
     */
    private String country;
    //constructores

    public Address() {
    }

    //metodos

    /**
     * validar algo
     */
    public Boolean validate(){
        return true;
    }
    /**
     * idk
     */
    public void outPutAsLabel(){

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {

        return "Direccion: "+street+", ciudad: "+city+", estado: "+state+", codigo postal: "+postalCode+", pais: "+country;
    }
}
