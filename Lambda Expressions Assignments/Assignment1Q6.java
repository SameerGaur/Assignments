import java.util.*;

public class Assignment1Q6 {

    interface  ConvertToUpperCase{
        public List<String> convertToUpperCase(List<String> list);
    }

    public static ConvertToUpperCase convertToUpperCase(){
        return (list)->{
            list.replaceAll(i-> String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1));
            return list;
        };
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        System.out.println("\nList before converting first letter to uppercase: \n");
        for (String i: list){
            System.out.println(i+" ");
        }
        System.out.println();

        list = convertToUpperCase().convertToUpperCase(list);

        System.out.println("\nList after converting first letter to uppercase: \n");
        for (String i: list){
            System.out.println(i+" ");
        }
        System.out.println();

    }
}