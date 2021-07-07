package RecursionIntermediate;

public class findFirstIndex {
	public static int firstIndex(int arr[],int n,int x,int i) {
		
		if(i==n)
			return -1;
		if(arr[i]==x)
			return i;
		return firstIndex(arr, n, x, i+1);
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {5,5,5,2,5 };
		int index=firstIndex(arr, 5, 5, 0);
		System.out.println(index);
	}
}
