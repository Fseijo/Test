import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("rentrez un chiffre");

        int number = scanner.nextInt();

        System.out.println("rentrez un chiffre");
        int number1 = scanner.nextInt();

        System.out.println("Result = " + (number1 + number));

    }
}