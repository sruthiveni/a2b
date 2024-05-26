package mmmmm;
import java.util.*;
public class A2b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char a=s1.charAt(0);
		int sum=0;
		for(int i=1;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				sum=sum*10+(int)s1.charAt(i)-48;
			}
			else
			{
				for(int j=0;j<sum;j++)
				{
					System.out.print(a);
				}
				sum=0;
				a=s1.charAt(i);
			}
		}
		for(int j=0;j<sum;j++)
		{
			System.out.print(a);
		}
	}

}
