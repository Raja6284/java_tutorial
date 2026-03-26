import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorCode{
    public static void main(String args[]){
        System.out.println("hello");

        List<Integer> L = new ArrayList<>();

        Comparator<Integer> cmp = new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        for(int i = 0; i<5; i++){
            L.add((int)(Math.random()*1000));
        }

        System.out.println(L);

        Collections.sort(L,cmp);

        System.out.println(L);


    }
}