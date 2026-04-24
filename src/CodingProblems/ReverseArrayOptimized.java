package CodingProblems;
import java.util.*;
public class ReverseArrayOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size/2; i++){
			int temp = arr[i];
			arr[i]= arr[size-1];
			arr[size-1] =temp;
			size--;
		}
		
   
	}

}
