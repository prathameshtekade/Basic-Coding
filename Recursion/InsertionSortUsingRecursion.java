package Recursion;

public class InsertionSortUsingRecursion {
	static int insertionsort(int arr[],int n) {
		if(n<=1) {
		return 0;
		}
		insertionsort(arr,n-1);
			int val=arr[n-1];
			int pos=n-2;
			while(pos>=0 && arr[pos]>val) {
				arr[pos+1]=arr[pos];
				pos=pos-1;
			}
			return arr[pos+1]=val; 
	}
	public static void main(String[] args) {	
		int[] arr= {6,5,4,3,2,1};
		int n=arr.length;
		insertionsort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}