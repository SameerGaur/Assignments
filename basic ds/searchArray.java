import java.util.*;
import static java.util.Arrays.*;
public class searchArray
{
static boolean searchArray(int[] arr, int toCheckValue)
{
boolean ans = false;

for (int i = 0; i <arr.length; i++)
{
	if (arr[i]==toCheckValue)
	{
	ans = true;
	break;
	}
	}
return ans;

}

public static void main(String[] args) {

int[] arr1 = { 5,12,14,6,78,19,1,23, 26, 35, 37,7,52,86,47 };

int valueToCheck = 19;

boolean ans = searchArray(arr1, valueToCheck);

if (ans == true) {

System.out.println("Number is found!!");

} else {

System.out.println("Number is not found!!");
}
}
}