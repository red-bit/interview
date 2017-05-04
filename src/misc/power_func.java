/*This program implements Math.power function in O(n) time complexity.
 */
package misc;

class power_func{
	public int power(int x,int y){
		if(y==0)
			return 1;
		else if(y%2==0)
			return power(x,y/2)*power(x,y/2);
		else 
			return x*power(x,y/2)*power(x,y/2);
	}
	public static void main(String args[]){
		power_func pf=new power_func();
		System.out.println(pf.power(2, 4));
		
	}
}