
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrimeNumber;

        do {
            System.out.println("Type '0' to exit the program.");
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Successfully exited the program.");
                break;
            }

            if (number < 2) {
                System.out.println("--> Number is not prime number.\n");
                continue;
            }

            isPrimeNumber = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.println("--> Number is prime number.\n");
            } else {
                System.out.println("--> Number is not prime number.\n");
            }
        } while (true);
    }
}