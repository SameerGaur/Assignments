import java.util.*;

public class armstrong_range
{
static boolean isArmstrong(int n)
{
int temp, first=0, last=0, sum=0;

temp=n;

while(temp>0)
{
temp = temp/10;
first++;
}
temp = n;
while(temp>0)
{

last = temp % 10;

sum +=  (Math.pow(last, first));

temp = temp/10;
}

if(n==sum)
{
return true;
}
else

	return false;
}
public static void main(String args[])
{
int num;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the limit: ");

num=sc.nextInt();
System.out.println("Armstrong Number up to "+ num + " are: ");
for(int i=100; i<=num; i++)

if(isArmstrong(i))

System.out.print(i+ ", ");
}
}