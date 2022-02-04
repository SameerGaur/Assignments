import java.util.*;

class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name = "+this.name+"| Height = "+this.height+"| Weight = "+this.weight;
    }
}
class HeightComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.weight>o2.weight){
            return -1;
        }
        else if(o1.weight<o2.weight){
            return 1;
        }
        else {
            return Double.compare(o2.height, o1.height);
        }
    }
}
public class Assignment2Q1 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>(new HeightComparator());
        set.add(new Person("Brad",166,70.5));
        set.add(new Person("Glen",167,63.8));
        set.add(new Person("Chris",155,70.9));
        set.add(new Person("Shankai",169,65.5));
        set.add(new Person("Alex",170,60.5));
        set.add(new Person("Golem",162,88.5));
        set.add(new Person("Park",162,53.5));

        System.out.println("Printing in the sorted order based upon weight first, if the weights are equal then based upon height:");
        for (Person person: set){
            System.out.println(person);
        }
    }
}