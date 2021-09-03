public class Customer {
    // attributes
    private String  job = "Customer";
    private String name;
    private String surname;
    private int telephone;
    private String email;
    private String address;

    // Create the constructor of the object to save initial values
    public Customer( String name, String surname, int telephone, String email, String address){
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    // setters
    public void setSurname(String newSurname){
        surname = newSurname; }
    public void setName(String newName){
        name = newName; }
    public void  setTelephone(int newTelephone){
        telephone = newTelephone; }
    public void setEmail(String newEmail){
        email = newEmail; }
    public void setAddress(String newAddress){
        address = newAddress; }





    // toString method to print  information  to screen
    public String toString() {
        String output = job+
           "\nName: " + name + " " + surname+
           "\nTelephone: " + telephone+
           "\nEmail: " + email+
           "\nAddress: " + address;
        return output;
    }
}


