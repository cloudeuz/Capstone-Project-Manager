public class Architect {
    // attributes
    private String  job = "Architect";
    private String nameA;
    private String surnameA;
    private int  telephoneA;
    private String emailA;
    private String addressA;

    // Create the constructor of the object to save initial values
    public Architect(String nameA, String surnameA, int telephoneA, String emailA, String addressA){
        this.nameA = nameA;
        this.surnameA = surnameA;
        this.telephoneA = telephoneA;
        this.emailA = emailA;
        this.addressA = addressA;
    }

    // setters
    public void setSurnameA(String newSurname){
        surnameA = newSurname; }
    public void setNameA(String newName){
        nameA = newName; }
    public void  setTelephoneA(int newTelephone){
        telephoneA = newTelephone; }
    public void setEmailA(String newEmail){
        emailA = newEmail; }
    public void setAddressA(String newAddress){
        addressA = newAddress; }




    // toString method to print  information  to screen
    public String toString() {
        String output = job+
        "\nName: " + nameA + " " + surnameA+
        "\nTelephone: " + telephoneA+
        "\nEmail: " + emailA+
        "\nAddress: " + addressA;

        return output;
    }
}


