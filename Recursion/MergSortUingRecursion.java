package Recursion;

public class MergSortUingRecursion {
	static void merge(int arr[],int s,int l) {
		int mid=(s+l)/2;
		int len1=mid-s+1;
		int len2=l-mid;
		int[] arr1=new int[len1];
		int[] arr2=new int[len2];
		
		int mainindex=s;
		for(int i=0;i<len1;i++) {
				 arr1[i]=arr[mainindex++];
			}
			mainindex=mid+1;
			for(int i=0;i<len2;i++) {
				arr2[i]=arr[mainindex++];
			}
			int index1=0;
			int index2=0;
			mainindex=s;
			while(index1<len1 && index2<len2) {
				if(arr1[index1]<arr2[index2]) {
					arr[mainindex++]=arr1[index1++];
				}
				else {
					arr[mainindex++]=arr2[index2++];
				}
		}
			while(index1<len1) {
					arr[mainindex++]=arr1[index1++];
			}
			while(index2<len2) {
					arr[mainindex++]=arr2[index2++];
			}

	}
	static void mergesort(int arr[],int s,int l) {
		if(s>=l) {
			return;
		}
		int mid=(s+l)/2;
		 
		mergesort(arr,s,mid);
		
		mergesort(arr,mid+1,l);
		
		merge(arr,s,l);
		
	}

	public static void main(String[] args) {
		int[] arr= {8,6,7,3,5,2,1}; 
		int n=7;
		
		mergesort(arr,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		return;
	}

}
