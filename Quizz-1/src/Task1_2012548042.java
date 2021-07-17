import java.util.Scanner;

public class Task1_2012548042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        System.out.print("Enter the number of sides: ");
        int sides_number = input.nextInt();

        double area = (sides_number * Math.pow(side, 2) /
                (4 * Math.tan(Math.PI / sides_number)));


        System.out.println("The area of the polygon is " + area);
    }
}