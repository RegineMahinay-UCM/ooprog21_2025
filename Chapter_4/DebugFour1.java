// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;

public class DebugFour1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();
  
        DebugCircle debugCircle = new DebugCircle(radius);
        System.out.println("The radius is " + debugCircle.getRadius());
        System.out.println("The diameter is " + debugCircle.getDiameter());
        System.out.println("The area is " + debugCircle.getArea());
    }
}
