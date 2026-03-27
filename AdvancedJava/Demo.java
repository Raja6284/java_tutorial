import java.util.*;
import java.util.function.Consumer;

public class Demo{
    public static void main(String args[]){
        System.out.println("hello");

        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9,10);
        Consumer<Integer> con = new Consumer<Integer>(){

            public void accept(Integer i){
                System.out.println(i);
            }
        };

        nums.forEach(con);

        // for(int i = 0; i<nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }

        // System.out.println();

        // for(int n: nums){
        //     System.out.println(n);
        // }

        // System.out.println();

        // nums.forEach(n -> System.out.println(n));

    }
}