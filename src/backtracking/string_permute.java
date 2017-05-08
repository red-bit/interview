package backtracking;
import java.io.*;
class string_permute{
	public void swap(StringBuffer str,int i,int j)
	{
		char temp=str.charAt(i);
		str.setCharAt(i,str.charAt(j));
		str.setCharAt(j,temp);
		
	}
	public void permute(StringBuffer str,int r,int l)
	{
		if(r==l)
			System.out.println(str);
		else
		{
			for(int i=r;i<=l;i++)
			{
				swap(str,r,i);
				permute(str,r+1,l);
				swap(str,r,i);
			}
		}
	}
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		sb.append(br.readLine());
		string_permute sp=new string_permute();
		int l=sb.length()-1;
		sp.permute(sb, 0, l);
	}
}