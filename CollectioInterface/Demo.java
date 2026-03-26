import java.util.ArrayList;
import java.util.Collection;

public class Demo{
    public static void main(String args[]){
        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(3);
        nums.add(33);
        nums.add(3333);
        nums.add(33333);
        nums.add(333333);

        System.out.println(nums.size());
        
        for(int n: nums){
            System.out.println(n);
        }

        System.out.println(nums);
        
    }
}