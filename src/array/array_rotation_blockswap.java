package array;

class array_rotation_blockswap{
	public int gcd(int a,int b){
		if(b==0)
			return a;
		else
			return (gcd(b,a%b));
	}
	public void block_swap(int arr[],int l,int x){
		int temp,i,j,k;
		int cf=gcd(l,x);
		for(i=0;i<cf;i++){
			j=i;
			k=i+cf;
			while(k<l)
			{
				temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j=k;
				k=j+cf;
			}
			//printarr(arr);
		}
	}
	public void printarr(int arr[])
	{
		int l=arr.length;
		for(int i=0;i<l;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[]){
		array_rotation_blockswap arbswap= new array_rotation_blockswap();
		int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int l=arr.length;
		arbswap.printarr(arr);
		arbswap.block_swap(arr,l, 3);
		arbswap.printarr(arr);
	}
}