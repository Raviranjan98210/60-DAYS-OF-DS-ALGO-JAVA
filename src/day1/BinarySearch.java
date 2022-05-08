package day1;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int arr[] = {1,2,4,5,6,8};
		
		System.out.println("Enter element");
		
		int element = s.nextInt();
		int size = arr.length;
		int start  = 0 ; 
		int end = size-1;
		int pos = -1;
		int mid ;
		
		while(start<=end) {
			mid = (start+end)/2;
			
			if(element == arr[mid]) {
				pos = mid;
				break;
			} 
			if(element>arr[mid]) {
				start = mid+1;
			}
			if(element<arr[mid]) {
				end = mid-1;
			}
			
		}
		if(pos<0) {
			System.out.println("element not found");
		}else {
			System.out.println("Element found at index: "+pos);
		}
		
	}

}
