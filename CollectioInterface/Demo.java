import java.util.*;

public class Demo{
    public static void main(String args[]){

        //Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();

        // nums.add(3);
        // nums.add(33);
        // nums.add(3333);
        // nums.add(33333);
        // nums.add(333333);

        // System.out.println(nums.size());

        // for(int i = 0; i<nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }
        
        // for(int n: nums){
        //     System.out.println(n);
        // }

        List<Integer> random = new ArrayList<Integer>();

        for(int i = 0; i<100; i++){
            random.add((int)(Math.random()*100));
        }

        //System.out.println(random.size());

        // for(int i = 0; i<random.size(); i++){
        //     System.out.println(random.get(i));
        // }

        //System.out.println(random);
       //System.out.println(nums);


       //Set<Integer> apnaSet = new HashSet<Integer>();
        Set<Integer> apnaSet = new TreeSet<Integer>();

       for(int i = 0; i<1000; i++){
        apnaSet.add((int)(Math.random()*1000));
       }
       
       System.out.println(apnaSet.size());
       System.out.println(apnaSet);

    //    for(int n : apnaSet){
    //     System.out.println(n);
    //    }
    }
}