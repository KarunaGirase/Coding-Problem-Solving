package CodingProblems;
import java.util.*;

public class MinimumElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		int min =arr[0];
		for(int j=0; j<size; j++){
			if(arr[j]<min){
				min = arr[j];
			}
		}
		System.out.println("Minimum element is: " + min);
	}

}
