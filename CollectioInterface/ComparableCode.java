import java.util.*;

class Students implements Comparable<Students>{

    String name;
    int marsk;
    
    public Students(String name,int marsk) {
        this.marsk = marsk;
        this.name = name;
    }

    public String toString() {
        return "Students [marsk=" + marsk + ", name=" + name + "]";
    }

    public int compareTo(Students that){
        if(this.marsk > that.marsk){
            return 1 ;
        }else{return -1 ;

        }
    }

    
}

public class ComparableCode{
    public static void main(String args[]){
        System.out.println("hello");

        Comparator<Integer> cmp = new Comparator<Integer>() {
            
            public int compare(Integer i, Integer j){
                if(i > j){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        Students stud = new Students("Raja",100);

        List<Students> L = new ArrayList<Students>();

        //L.add(stud);
        L.add(new Students("Raja",100));
        L.add(new Students("Satyanshu",80));
        L.add(new Students("Sagar",96));
        L.add(new Students("Pratham",85));
        //System.out.println(stud.toString());

        System.out.println(L);

        Collections.sort(L);

        for(Students ss : L){
            System.out.println(ss.toString());
        }
    }
}