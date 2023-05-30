package Tasks;

import java.util.HashMap;

public class Employee {
    //Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary.
    // Output should be in the below format John Smith=$100000
    public static void main(String[] args) {

        HashMap<String,Integer> employee=new HashMap();

        employee.put("John Smith",5000);
        employee.put("John Hill",4000);
        employee.put("John X",100000);

       String GetHighestSalary=" ";
       int HighestSalary=0;

       for (var c:employee.entrySet()) {
           if (c.getValue()>HighestSalary){
            HighestSalary= c.getValue();
            GetHighestSalary=c.getKey();
       }
    }
        System.out.println(GetHighestSalary+" =$"+HighestSalary);















    }
}
