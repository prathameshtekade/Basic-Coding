package Recursion;

public class binarysortusibgrecursion {
  static boolean isSorted(int arr[],int n) {
	  if(n == 1 || n == 0) 
		  return true;
      return arr[n-2] <= arr[n-1] && isSorted(arr, n-1);
 
	  }
  public static void main(String[] args) {
	   int arr[]= {1,2,8,4,5,7};
	   int i=0;
	   int n=arr.length-1;
	  boolean ans= isSorted(arr,n);
		   System.out.println(ans);
  }
}
