import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


public class Assignment2Q8_2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list
                = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = (Integer)itr.next();
            System.out.println(no);
            if (no == 8)

                list.add(14);
        }
    }
}