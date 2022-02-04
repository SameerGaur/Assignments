interface SimpleInterest{
    public double Si(int principal,int time,double rate);
}

public class Assignment1Q1 {
    public static void main(String[] args) {
        SimpleInterest simpleInterest = ((principal, time, rate) -> (principal*time*rate)/100 );
        System.out.println("Simple Interest \n Principal = 1000 \n Rate of interest = 6.5 \n Time = 4");
        System.out.println("Simple interest = "+simpleInterest.Si(1000,4,6.5));

    }
}