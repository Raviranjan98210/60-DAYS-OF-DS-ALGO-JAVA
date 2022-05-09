package day2;

public class SelectionSort {

	public static void main(String[] args) {
	
		int arr[] = {9,5,2,5,10,4,8};
		
		int size = arr.length;
	
        //Uper for loop is used for the total round (i.e one less than the total size of array, 
		//because the last element of array will be sorted automatically) required to array to be sorted
		
		for(int i =0;i<size-1;i++) {
			int minIndex=i;
			int min = arr[i];
            //This is used for finding the minimum value 		
			for(int j=i+1;j<size;j++) {
				if(arr[j]<min) {
					minIndex=j;
					min=arr[j];
				}
			}
			
			// Swapping the minimum value for each position of array except last one
			if(minIndex !=i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
			
		}
		
		for(int i=0;i<size;i++) {
			System.err.print(arr[i]+" ");
		}
		

	}

}
