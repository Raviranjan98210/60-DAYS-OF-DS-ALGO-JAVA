package day2;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {8,5,9,2,1,3,6};
		
		int size= arr.length;
		
//		solution-1
//		for(int i=0;i<size-1;i++) {
//			
//			for(int j=i; j>=0 ; j--) {
//				if(arr[j+1]<arr[j]) {
//					arr[j+1] = arr[j];
//					
//				}
//			}
//			arr[i]=
//		}
		
		for(int i=1;i<size;i++) {
			int j = i-1;
			int temp = arr[i];
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =temp;
		}
		
		for(int i =0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
