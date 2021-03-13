import java.util.*;
public class Login {
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)){

            System.out.println("wat is je naam?");
            String studentName = scanner.nextLine();

            System.out.println("wat is je studentennummer?");
            String studentNumber = scanner.nextLine();

            if ( "Pindakaas".equals(studentName) && "42069".equals(studentNumber)) {
                System.out.println("je bent ingelogd.");
            } else {
                System.out.println("ongeldige inloggegevens");
            }
        }
    }
}
