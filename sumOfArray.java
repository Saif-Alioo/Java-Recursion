package RecursionIntermediate;

public class sumOfArray {
	public static int sumArray(int arr[],int n) {
		//Base case
		if(n==0)
			return 0;
		//recursion
		int smallAns=sumArray(arr, n-1);
		//Calculation
		return smallAns+arr[n-1];
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {1,6,3,2,5 };
		int sum=sumArray(arr, 5);
		System.out.println(sum);
		
	}
}
