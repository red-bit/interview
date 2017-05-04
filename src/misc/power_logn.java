//This program implements Math.power function in logn time complexity.It is true both for positive and negative power
package misc;

class power_logn{
	public float power(int x,int y){
		if(y==0)
			return 1;
		float temp=power(x,y/2);
		if(y%2==0)
			return temp*temp;
		else
		{
			if(y>0)
				return x*temp*temp;
			else
				return (temp*temp)/x;
		}
	}
	public static void main(String args[]){
		power_logn pl=new power_logn();
		System.out.println(pl.power(2, -5));
	}
}