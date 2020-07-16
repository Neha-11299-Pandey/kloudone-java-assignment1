// write a java program to print the area and perimeter of a circle.
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ar = new Scanner(System.in);
		System.out.println("input the radius of the circle:");
		double radius = ar.nextDouble();
		System.out.println("perimter is = "+(2*radius*Math.PI));
		System.out.println("area is =" +(Math.PI*radius*radius));
		}

}
