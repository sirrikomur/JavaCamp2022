import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                total += i;
            }
        }

        if (number == total){
            System.out.println("--> It is a Perfect Number.");
        }else{
            System.out.println("--> It is not a Perfect Number.");
        }
    }
}