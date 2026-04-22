package CodingProblems;
import java.util.*;

public class MaximumElementArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];

		for (int j = 0; j < size; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
		}

		System.out.println("Maximum element is: " + max);
	}
}