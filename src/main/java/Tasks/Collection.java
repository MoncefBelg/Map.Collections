package Tasks;

import java.util.*;

public class Collection {
    //Create the collection that will store single uniques Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        {

            obj.add("I will ");
            obj.add("Learn");
            obj.add("Java");
            obj.add("during a Period");
            obj.add("of six Month");
            for(String c:obj){
                StringBuffer concat = new StringBuffer();
                    System.out.print(concat.append(c));            }

            }
        }
    }