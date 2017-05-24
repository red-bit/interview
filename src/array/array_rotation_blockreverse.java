package array;

class array_rotation_blockreverse{
	public void reverse(int arr[],int l,int r){
		int temp;
		while(l<r){
			temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;
			r--;
		}
	}
	public void printarr(int arr[]){
		int l=arr.length;
		for(int i=0;i<l;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[]){
		
		array_rotation_blockreverse arb =new array_rotation_blockreverse();
		int x=3;
		int arr[]={1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		arb.printarr(arr);
		arb.reverse(arr, 0, x-1);
		arb.reverse(arr, x, n-1);
		arb.reverse(arr, 0, n-1);
		arb.printarr(arr);
	}
}