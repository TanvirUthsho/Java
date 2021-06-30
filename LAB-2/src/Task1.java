/* (Algebra: solve quadratic equations) The two roots of a quadratic equation ax2 + bx + c = 0 can be
obtained using the following formula:
𝒓𝟏 =
􀬿𝒃􀬾􀶥𝒃𝟐􀬿𝟒𝒂𝒄
𝟐𝒂
and 𝒓𝟐 =
􀬿𝒃􀬿􀶥𝒃𝟐􀬿𝟒𝒂𝒄
𝟐𝒂
b2-4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real
roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots. Write a
program that prompts the user to enter values for a, b, and c and displays the result based on the
discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one
root. Otherwise, display “The equation has no real roots”.*/

import java.util.Scanner;
public class Task1
{
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }
    }
}  