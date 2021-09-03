import java.util.Scanner;

public class projectManager {
    public static void main(String[] args) {
        // gets all project info
        Scanner input = new Scanner(System.in);

        System.out.println("Project Number: ");
        int projectNum = input.nextInt();

        input = new Scanner(System.in);
        System.out.println("Project Name: ");
        String projectName = input.nextLine();

        System.out.println("Project Build Type: ");
        String buildType = input.nextLine();

        System.out.println("Project Address: ");
        String projectAddress = input.nextLine();

        System.out.println("Project Erf Number: ");
        int erfNum = input.nextInt();

        System.out.println("Project Total Fee: ");
        double totalFee = input.nextDouble();

        System.out.println("Project Amount Paid to date: ");
        double paid = input.nextDouble();

        input = new Scanner(System.in);
        System.out.println("Project Deadline: ");
        String deadline = input.nextLine();

        // gets all Architect info
        System.out.println("Please enter Architect surname: ");
        String SurnameA = input.nextLine();
        System.out.println("Please enter Architect name: ");
        String NameA = input.nextLine();
        System.out.println("Please enter Architect telephone number: ");
        int TelephoneA = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Please enter Architect email: ");
        String EmailA = input.nextLine();
        System.out.println("Please enter Architect Address: ");
        String AddressA = input.nextLine();

        Architect architect = new Architect(SurnameA, NameA, TelephoneA, EmailA, AddressA);// creates Architect

        // gets all contractor info
        System.out.println("Please enter contractor surname: ");
        String surnameC = input.nextLine();
        System.out.println("Please enter contractor name: ");
        String nameC = input.nextLine();
        System.out.println("Please enter contractor telephone number: ");
        int telephoneC = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Please enter contractor email: ");
        String emailC = input.nextLine();
        System.out.println("Please enter contractor Address: ");
        String addressC = input.nextLine();

        Contractor contractor = new Contractor(surnameC, nameC, telephoneC, emailC, addressC); // creates contractor

        System.out.println("Please enter Customer surname: ");
        String surname = input.nextLine();
        System.out.println("Please enter Customer name: ");
        String name = input.nextLine();
        System.out.println("Please enter Customer telephone number: ");
        int telephone = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Please enter Customer email: ");
        String email = input.nextLine();
        System.out.println("Please enter Customer Address: ");
        String address = input.nextLine();

        Customer customer = new Customer(surname, name, telephone, email, address);  // creates Customer

        // creates project
        projectObject projectOne = new projectObject(projectNum, projectName, buildType, projectAddress, erfNum, totalFee, paid, deadline, architect, contractor, customer);

        System.out.println(projectOne);

        // user input for a choice to pick between the if statements
        System.out.println("""
                enter 1 :to Change the due date of the project.
                enter 2 :to Change fee paid to date.
                enter 3 :to Update a contractor contact details
                enter 4:to Finalise the project""");
        Scanner inputChoice = new Scanner(System.in);
        int choice = inputChoice.nextInt();

        if (choice == 1) {//Changes the due date
            Scanner inputD = new Scanner(System.in);
            System.out.println("new: ");
            String newDeadline = inputD.nextLine();
            projectOne.setDeadline(newDeadline);
            System.out.println("Changes have been made.\n");
            System.out.println(projectOne);
        }
        if (choice == 2) {//Changes fee paid to date
            Scanner inputP = new Scanner(System.in);
            System.out.println("new: ");
            double newP = inputP.nextDouble();
            projectOne.setPaid(newP);
            System.out.println("Changes have been made.\n");
            System.out.println(projectOne);
        }
        if (choice == 3) {//Changes contractor contact details
            Scanner inputChoice2 = new Scanner(System.in);
            int choice2 = inputChoice.nextInt();
            // Choice2 picks which contact detail to edit  from the contractor

            System.out.println("""
                    enter 1 :to Change Email
                    enter 2 :to Change Telephone number
                    enter 3 :to Change address""");
            if (choice2 == 1) {
                Scanner inputE = new Scanner(System.in);
                System.out.println("new: ");
                String newE = inputE.nextLine();
                contractor.setEmailC(newE);
                System.out.println("Changes have been made.\n");
                System.out.println(projectOne);
            }
            if (choice2 == 2) {
                Scanner inputT = new Scanner(System.in);
                System.out.println("new: ");
                int newT = inputT.nextInt();
                contractor.setTelephoneC(newT);
                System.out.println("Changes have been made.\n");
                System.out.println(projectOne);
            }
            if (choice2 == 3) {
                Scanner inputA = new Scanner(System.in);
                System.out.println("new: ");
                String newA = inputA.nextLine();
                contractor.setAddressC(newA);
                System.out.println("Changes have been made.\n");
                System.out.println(projectOne);
            }
        }

        if (choice == 4) {// prints invoice
            System.out.println("Invoice:");
            System.out.println(customer.toString());
            if (totalFee != paid){
                double invoice = totalFee - paid;
                System.out.println("customer must still pay:" + invoice);
            }
        }
    }
}








































































