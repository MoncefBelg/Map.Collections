package Tasks;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestPerson    {
    //In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a Person Object. Print each object details.
    public static void main(String[] args) {

        Person person=new Person("Amine","Reda",25,5000.5);
        Person person1=new Person("Karim","Amine",23,5700.5);
        Person person2=new Person("Mohammed","Reda",30,400.5);

        LinkedHashMap<Integer,Person> PersonID=new LinkedHashMap<>();

        PersonID.put(1,person);
        PersonID.put(2,person1);
        PersonID.put(3,person2);

        for (var b:PersonID.entrySet()){
          Person c= b.getValue();
            System.out.println(b.getKey());
            c.printDetails();

        }

        }


}
