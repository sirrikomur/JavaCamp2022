import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter;

        System.out.println("Just enter one character. If you enter multiple characters, the first character is accepted.");
        System.out.print("Character: ");
        letter = scanner.nextLine().charAt(0);

        /* FIRST WAY */
        char[] hardVowels = {'A', 'a', 'I', 'ı', 'O', 'o', 'U', 'u'};
        char[] softVowels = {'E', 'e', 'I', 'i', 'Ö', 'ö', 'Ü', 'ü'};

        for (int i = 0; i < hardVowels.length; i++) {
            if (letter == hardVowels[i]) {
                System.out.println("HARD");
                return;
            }
        }

        for (int i = 0; i < softVowels.length; i++) {
            if (letter == softVowels[i]) {
                System.out.println("SOFT");
                return;
            }
        }

        System.out.println("It's not a vowel!");


        /* SECOND WAY
        switch (letter) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("HARD");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':
                System.out.println("SOFT");
                break;
            default:
                System.out.println("It's not a vowel!");
        }*/
    }
}