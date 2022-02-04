import java.util.*;
public class Armstrong 
{
	public static void main(String arg[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no.to check if it is armstrong or not?");
		
		int num=s.nextInt();
		int temp;
		int rem,rev=0;
		
		for(temp=num;temp>0;)
		{
			rem=temp%10;
			rev=rev+rem*rem*rem;
			temp=temp/10;
		}
		if(rev==num)
			System.out.println(num+"is a armstrong no.");
		
		else
			System.out.println(num+"is not an armstrong no.");
	}		
}
