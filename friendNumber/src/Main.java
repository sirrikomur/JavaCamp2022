import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;

        int total1 = 0;
        int total2 = 0;

        System.out.print("Enter first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        number2 = scanner.nextInt();

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0){
                total1 += i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0){
                total2 += i;
            }
        }

        if (number1 == total2 && number2 == total1){
            System.out.println("The two numbers are Friend Numbers.");
        }else {
            System.out.println("The two numbers are not Friend Numbers.");
        }
    }
}