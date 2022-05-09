package day2;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {3,5,2,9,1,7,12,4};
		
		int size = arr.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<size;i++) {
			System.err.print(arr[i]+" ");
		}

	}

}
