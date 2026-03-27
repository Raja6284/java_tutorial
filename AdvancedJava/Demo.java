import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo{
    public static void main(String args[]){
        System.out.println("hello");

        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9,10);
        Consumer<Integer> con = new Consumer<Integer>(){

            public void accept(Integer i){
                System.out.println(i);
            }
        };

        

        Stream<Integer> ss = nums.stream();
        Stream<Integer> s1 = ss.filter(n -> n%2==0);
        Stream<Integer> s2 = s1.map(n -> n*2);
        int result = s2.reduce(0, (c,e) -> c+e );

        //s2.forEach(con);

        System.out.println(result);

        int result2 = nums.stream()
                            .filter(n -> n%2==0)
                                .map(n -> n*2)
                                    .reduce(0,(c,e)->c+e);

        System.out.println(result2);

        var r = 10;

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