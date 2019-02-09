import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj hasło: ");

        String password = input.nextLine();
        String[] passwordTab = password.split("");
        int lengthPassword = passwordTab.length;
        String[] temporarypasswordTab = new String[lengthPassword];

        for (int i = 0; i < lengthPassword; i++) {
            temporarypasswordTab[i] = " _ ";
        }

        for (String underlinePassword :
                temporarypasswordTab) {
            System.out.print(underlinePassword);
        }

        int count = 0;

        while (true) {
            System.out.println();
            System.out.println("Podaj literę lub zgadnij od razu słowo: ");
            String userPassword = input.next();

            if (userPassword.equals(password)) {
                System.out.println("Zgadłeś!");
                break;
            } else {
                    for (int i = 0; i < lengthPassword; i++) {
                        if (passwordTab[i].equals(userPassword)) {
                            temporarypasswordTab[i] = userPassword;
                        }
                    }
                count++;
                if (Arrays.equals(passwordTab, temporarypasswordTab)) {
                    System.out.print("Zgadłeś");
                    break;
                }
                if (count == 3) {
                    System.out.println("Wykorzystałeś 3 próby!\nKoniec gry!");
                    System.out.println("Prawidłowe hasło to: " + password + ".");
                    break;
                }
                for (String givenPassword :
                        temporarypasswordTab) {
                    System.out.print(givenPassword);
                }
            }
        }
    }
}











