public class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;

    Contact(String group, String email, String firstName, String lastName, String zipcode,
            String country, String city, String countryCode, String number) {
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        if (this.group.equals("")) this.group = "-";
        if (this.email.equals("")) this.email = "-";
        if (this.firstName.equals("")) this.firstName = "-";
        if (this.lastName.equals("")) this.lastName = "-";
        if (countryCode.equals("")) countryCode = "-";
        if (number.equals("")) number = "-";
        if (zipcode.equals("")) zipcode = "-";
        if (country.equals("")) country = "-";
        if (city.equals("")) city = "-";
        this.phoneNumber = new PhoneNumber(countryCode, number);
        this.address = new Address(zipcode, country, city);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "group='" + group + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address=" + address +
                '}';
    }
}
