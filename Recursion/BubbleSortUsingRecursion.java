package Recursion;

public class BubbleSortUsingRecursion {
	static int bubblesort(int arr[],int n) {
		if(n==0 || n==1) {
			return 0 ;
		}
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=0;
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
		}
			
		}
		return bubblesort(arr,n-1);
		
	}
	
	public static void main(String[] args) {
		int arr[]= {5,7,1,2,6,8};
		int n=6;
		bubblesort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
