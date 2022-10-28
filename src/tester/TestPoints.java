package tester;

import java.util.Scanner;
import com.cdac.geometry.Point2D;

public class TestPoints {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Point2D Array.");
		int size = sc.nextInt();

		Point2D[] pointers = new Point2D[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the coordinates");
			pointers[i] = new Point2D(sc.nextInt(), sc.nextInt());
		}

		for (Point2D point : pointers) {
			System.out.println(point);
		}
		
		System.out.println("Enter the points indices to compare:");
		
		int n1 = sc.nextInt() - 1;
		int n2 = sc.nextInt() - 1;
		
		if (pointers[n1].isEqual(pointers[n2]) == false) {
			System.out.println("Points are not Same and Distance between 2 points is: " + pointers[n1].calculateDistance(pointers[n2]));
		} else
			System.out.println("Points are same.");
	}

}
