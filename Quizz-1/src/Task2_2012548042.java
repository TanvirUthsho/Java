import java.util.Scanner;
public class Task2_2012548042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        double age = input.nextDouble();
        System.out.print("Enter the weight in kilograms: ");
        int weight_kg = input.nextInt();
        if (age < 40) {

            if (weight_kg > 90)
                System.out.println("You are overweight.");

        }
        else
            System.out.println("You are not overweight.");

    }
}
