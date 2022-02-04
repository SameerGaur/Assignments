	import java.util.*;
	import java.lang.Math;
	class SiCi {
	    public double simpleInterest(double principalAmount,int time,double interestRate)
	    {
			double si;
			si=(principalAmount*interestRate*time)/100;
			System.out.println("Simple interest is" + si);
			return si;
			}
	    public double compoundInterest(double principalAmount,int time,double interestRate){

			double ci= principalAmount *(Math.pow((1 + interestRate/ 100), time));
			System.out.println("compound interest is" + ci);
			return ci;


			}
	}
	public class Assignment1Q3 {
	    public static void main (String args[]) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The P,R,T values");
			double p=sc.nextDouble();
			int t=sc.nextInt();
			double i=sc.nextDouble();
			SiCi s=new SiCi();

			s.simpleInterest(p,t,i);
			s.compoundInterest(p,t,i);

			}
	}


