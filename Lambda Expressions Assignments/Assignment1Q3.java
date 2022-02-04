import java.util.*;

public class Assignment1Q3 {
	
	public interface Function {
		int apply(int n);
	}
	
    static int modifyValue(int n,Function fun) {
      return (int)fun.apply(n);
    }

    static class Product {
    }

    static void display(int r) {
        System.out.println(r);
    }

    public static void main(String[] args) {
        int r =modifyValue(5,val->(Integer)val+ 5);
        display(r);
    }
}