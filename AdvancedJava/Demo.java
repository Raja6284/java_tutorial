import java.util.Arrays;
import java.util.*;

public class Demo{
    public static void main(String args[]){
        System.out.println("hello");

        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9,10);


        for(int i = 0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }

        System.out.println();

        for(int n: nums){
            System.out.println(n);
        }

        System.out.println();

        nums.forEach(n -> System.out.println(n));

    }
}