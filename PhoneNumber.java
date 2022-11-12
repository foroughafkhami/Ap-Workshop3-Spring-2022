public class PhoneNumber {
    private String countryCode;
    private String number;
    public PhoneNumber(String countryCode,String number){
        this.countryCode = countryCode;
        if(number.length() == 12) {
            this.number = number;
        }
        else{
            this.number = "-";
            System.out.println("Wrong number.");
            return;
        }
    }
    //    get and return countryCode of phone number
    public String getCountryCode(){
        return countryCode;
    }
    public void setCountryCode(String countryCode){
        this.countryCode= countryCode;
    }

    //    get and return countryCode of phone number
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number= number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", number=" + number +
                '}';
    }
}
