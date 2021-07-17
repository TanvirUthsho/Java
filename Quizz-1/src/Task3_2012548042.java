import java.util.Scanner;

public class Task3_2012548042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num of lines:");
        int num_of_lines = input.nextInt();
        int i, j, k, T, b = 1, r = num_of_lines;

        for (i = 1; i <= num_of_lines; i++) {
            for (j = r; j >= 1; j--) {
                System.out.print("  ");
            }
            for (k = b; k >= 1; k = k - 2) {
                System.out.print(k + " ");

            }
            for (T = 3; T <= b; T = T + 2) {
                System.out.print(T + " ");
            }
            b = b + 2;
            r = r - 1;
            System.out.println();

        }
    }
}

