package CodingProblems;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<size; i++){
			arr[i]= sc.nextInt();
		}
		
		for(int i=size-1; i>=0; i--){
			System.out.println("Reverse of array: " + arr[i]);
		}
	}

}
