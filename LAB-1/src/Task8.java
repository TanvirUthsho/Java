import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        double runwayLength = (speed*speed) / (2*acceleration);
        System.out.println("The minimum runway length for this airplane is "+ runwayLength);

    }
}
