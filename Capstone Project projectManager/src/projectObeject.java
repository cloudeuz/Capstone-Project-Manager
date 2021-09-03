class projectObject {
    // attributes
    private int projectNum;
    private String projectName;
    private String buildType;
    private String projectAddress;
    private int erfNum;
    private double totalFee;
    private double paid;
    private String deadline;
    private Architect architect;
    private Contractor contractor;
    private Customer customer;


    // Create the constructor of the object to save initial values
    public projectObject(int projectNum, String projectName, String buildType, String projectAddress, int erfNum, double totalFee, double paid, String deadline, Architect architect, Contractor contractor, Customer customer) {
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.buildType = buildType;
        this.projectAddress = projectAddress;
        this.erfNum = erfNum;
        this.totalFee = totalFee;
        this.paid = paid;
        this.deadline = deadline;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;
    }

    // setters
    public void setProjectNum(int newNum) {
        projectNum = newNum;
    }

    public void setProjectName(String newName) {
        projectName = newName;
    }

    public void setBuildType(String newBuildType) {
        buildType = newBuildType;
    }

    public void setProjectAddress(String newAddress) {
        projectAddress = newAddress;
    }

    public void setProjectErfNum(int newErfNum) {
        erfNum = newErfNum;
    }

    public void setTotalFee(double newTotalFee) {
        totalFee = newTotalFee;
    }

    public void setPaid(double newPaid) {
        paid = newPaid;
    }

    public void setDeadline(String newDeadline) {
        deadline = newDeadline;
    }


    // toString method to print  information  to screen
    public String toString() {
        String output ="\nProject Number: " + projectNum+
                "\nProject Name: " + projectName +
                "\nBuilding Type: " + buildType+
                "\nProject Address: " + projectAddress+
                "\nErf Num: " + erfNum+
                "\nTotal Fee: " +totalFee+
                "\nAmount Paid: " + paid+
                "\nErf Num: " + erfNum+
                "\nDeadline: " + deadline+
                "\n"+
                "\n" + architect+
                "\n"+
                "\n" + contractor+
                "\n"+
                "\n" + customer;
        return output;
    }



}

