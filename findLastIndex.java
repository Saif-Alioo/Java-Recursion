package RecursionIntermediate;

//import java.util.ArrayList;
import java.util.Vector;

//Find index of last element .
public class findLastIndex {
	public static int lastIndex(int arr[],int n,int x,int i) {
		if(i==-1)
			return -1;
		if(arr[i]==x)
			return i;
		return lastIndex(arr, n-1, x, i-1);
	}
	//Find all The index number of a element .
	public static void allIndex(int arr1[],int n,int x,int i) {
		if(i==n) {
			return;
		}
		if(arr1[i]==x)
			System.out.print(i +" ");
		allIndex(arr1, n, x, i+1);
	}
	
	//Count the number of occurrence.
	public static int countOccurrence(int arr[],int n,int x,int i) {
		if(i==n)
			return 0;
		if(arr[i]==x) 
			return 1+countOccurrence(arr, n, x, i+1);
		else
		return 0+countOccurrence(arr, n, x, i+1);
	}
	
	//Check palindrome 
	public static boolean cheackPali(int arr[],int s,int e) {
		if(s>e) {
			return true;
		}
		if(arr[s]==arr[e]) {
			return cheackPali(arr, s+1, e-1);
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {1,5,5,2,5 };
		int index=lastIndex(arr, 5, 5, 4);
		System.out.println("Index of last found element "+index);
		System.out.println(" ");
		int arr1[]=new int[] {1,5,2,5,1 };
		System.out.print("Find index of all the element: ");
		allIndex(arr1, 5, 5, 0);
		System.out.println("\n ");
		int ans=countOccurrence(arr1,5, 5, 0);
		System.out.println("Count occurence of element "+ans);
		System.out.println(" ");
		System.out.print("Plaindrome or not::");
	System.out.print(cheackPali(arr1, 0, 4));
	//Store All the Index
	
	
	}

}
//we iterating the array from n-1 till -1 if we reach -1 that's mean we not found the element.The index start from n-1(value of i).

