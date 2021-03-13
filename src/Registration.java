import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Register register = new Register();
        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("Wat is je voornaam?");
            String firstName = scanner.nextLine();
            register.setFirstName(firstName);

            System.out.println("Wat is je achternaam?");
            String lastName = scanner.nextLine();
            register.setLastName(lastName);

            System.out.println("wat us he studentennummer?");
            String studentNumber = scanner.nextLine();
            register.setStudentNumber(studentNumber);

            printRegisterData(register);

        }
    }

    private static void printRegisterData(Register register) {
        System.out.println(register.getFirstName());
        System.out.println(register.getLastName());
        System.out.println(register.getStudentNumber());

    }
}
class Register {
    private String firstName;
    private String lastName;
    private String studentNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
