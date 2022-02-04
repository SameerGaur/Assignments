import java.util.*;

public class Assignment2Q2 {
    public static HashSet<Integer> unordered(HashSet<Integer> hashSet){
        hashSet.add(33);
        hashSet.add(44);
        hashSet.add(11);
        hashSet.add(55);
        hashSet.add(22);

        return hashSet;
    }
    public static LinkedHashSet<Integer> ordered(LinkedHashSet<Integer> linkedHashSet){
        linkedHashSet.add(44);
        linkedHashSet.add(55);
        linkedHashSet.add(11);
        linkedHashSet.add(22);
        linkedHashSet.add(33);

        return linkedHashSet;
    }
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        hashSet = unordered((HashSet<Integer>) hashSet);
        linkedHashSet = ordered((LinkedHashSet<Integer>) linkedHashSet);



        System.out.println(" Elements in HashSet: ");
        for(Object i:hashSet){
            System.out.print(i+" ");
        }
        System.out.println("\n In HashSet the order in which the elements are inserted is not maintained ");


        System.out.println("\n Elements in LinkedHashSet: ");
        for(int i:linkedHashSet){
            System.out.print(i+" ");
        }
        System.out.println("\n In LinkedHashSet the order in which the elements are inserted is maintained ");
    }
}