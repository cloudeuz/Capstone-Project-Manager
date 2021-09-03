public class Contractor {
    // attributes
    private String  job = "Contractor";
    private String nameC;
    private String surnameC;
    private int telephoneC;
    private String emailC;
    private String addressC;

    // Create the constructor of the object to save initial values
    public Contractor(String nameC, String surnameC, int telephoneC, String emailC, String addressC){
        this.nameC = nameC;
        this.surnameC = surnameC;
        this.telephoneC = telephoneC;
        this.emailC = emailC;
        this.addressC = addressC;
    }

    // setters

    public void setSurnameC(String newSurname){
        surnameC = newSurname; }
    public void setNameC(String newName){
        nameC = newName; }
    public void  setTelephoneC(int newTelephone){
        telephoneC = newTelephone; }
    public void setEmailC(String newEmail){
        emailC = newEmail; }
    public void setAddressC(String newAddress){
        addressC = newAddress; }





    // toString method to print  information  to screen
    public String toString() {
        String output = job+
         "\nName: " + nameC + " " + surnameC+
         "\nTelephone: " + telephoneC+
         "\nEmail: " + emailC+
         "\nAddress: " + addressC;

        return output;
    }
}

