
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int largestNumber;

        System.out.print("Enter first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        thirdNumber = scanner.nextInt();

        /* First Way */
        if (firstNumber > secondNumber) {
            largestNumber = firstNumber;
        } else {
            largestNumber = secondNumber;
        }

        if (thirdNumber > largestNumber) {
            largestNumber = thirdNumber;
        }

        /* Second Way
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            largestNumber = firstNumber;
        } else if (secondNumber > thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }*/

        System.out.println("--> The Largest Number is " + largestNumber + ".");
    }
}