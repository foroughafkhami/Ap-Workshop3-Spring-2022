public class Address {
    private String zipcode;
    private String country;
    private String city;
    //private String email;
    Address(String zipcode, String country, String city) {
        this.zipcode = zipcode;
        this.country = country;
        this.city = city;
       // this.email = email;
    }
    //    get and return zipcode of address of contact
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    //    get and return country of address of contact
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    //    get and return city of address of contact
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    //    get and return email of address of contact
    /*public String getEmail() {
        return email;
    }
    public void setEmail(String zipcode) {
        this.email = email;
    }*/

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
