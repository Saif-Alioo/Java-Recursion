package RecursionIntermediate;

public class checkSorteArray {
	
	public static boolean sortedArray( int arr[],int n) {
		if(n==0 || n==1) 
			return true;
		
		if(arr[n-1]<arr[n-2]) 
			return false;
		boolean isArraySorted=sortedArray(arr, n-1);
		if(isArraySorted) {
			return true;
		}else
			return false;
	}
public static void main(String[] args) {
	int arr[]=new int[] {1,6,3,2,5 };
	if(sortedArray(arr, 5)) {
		System.out.println("Sorted Array");
	}else {
		System.out.println("Unsorted Array");
	}
	
}
}
