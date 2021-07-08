package RecursionAdvanced;

public class recursionProblem {
public static void print(char input[],int i,int n) {
		
		if(i>=n) {
			return;
		}
		System.out.print(input[i]+" ");
		print(input,i+1,n);
	}
	
	
public static void printRevers(char input[],int i,int n) {
		
		if(i>=n) {
			return;
		}
		printRevers(input,i+1,n);
		System.out.print(input[i]+" ");
		
		
	}
public static int charLength(char input[],int i,int n) {
	if (i>=n) {
		return 0;
	}
	int smallAns=charLength(input, i+1, n);
	
	return 1+smallAns;
}

//Replace character of array
public static void replacChar(char arr[],int i) {
	int e=arr.length;
	if(i>=e)
		return;
	if(arr[i]=='a') {
		arr[i]='x';
	}
	replacChar(arr, i+1);
}
//Remove the character
public static void removeChar(char arr[],int i) {
	int e=arr.length;
	if(i>=e)
		return;
	if(arr[0]!='a') {
		removeChar(arr, i+1);
	}else {
		for(int j=0;arr[i]!=0;j++) {
			arr[j]=arr[j+1];
		}
		removeChar(arr,i);
	}
	
}
public static void main(String[] args) {
	//Simple print
	char []in=new char[]{'a','v','c'};
	print(in,0,3);
	System.out.println("\n");
	//Reverse Print 
	char []in2=new char[]{'v','a','c'};
	printRevers(in2,0,3);
	System.out.println("\n");
	//length
	int len=charLength(in2,0,3);
	System.out.println("Length of character is "+len);
	System.out.println(" ");
	//Replace character
	replacChar(in,0);
	System.out.println(in);
	//Remove char
	removeChar(in,0);
	System.out.println(in2);
}
}
