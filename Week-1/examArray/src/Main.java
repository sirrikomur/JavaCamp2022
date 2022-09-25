public class Main {
    public static void main(String[] args) {
        String[][] exam = new String[5][2];

        exam[0][0] = "1";
        exam[0][1] = "A";
        exam[1][0] = "2";
        exam[1][1] = "C";
        exam[2][0] = "3";
        exam[2][1] = "B";
        exam[3][0] = "4";
        exam[3][1] = "D";
        exam[4][0] = "5";
        exam[4][1] = "C";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.print(exam[i][j] + "/");
                } else {
                    System.out.println(exam[i][j]);
                }
            }
        }
    }
}