import java.util.Scanner;

public class choinka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Wpisz liczbę pięter choinki: ");
        int x = input.nextInt();

        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= x - i; j++)
                System.out.print(" ");

                for (int k = 1; k <= (2 * i - 1); k++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }