package Tasks;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class IntCollection {

    public static void main(String[] args) {
        List<Integer> integers=new LinkedList<>();
        //Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers
        integers.add(20);
        integers.add(30);
        integers.add(20);
        integers.add(50);
        int sum=0;
        for (var s:integers){
                 sum+=s;
        }
        System.out.println(sum);
    }
}
