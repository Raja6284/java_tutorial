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

       for(int i = 0; i<10; i++){
        apnaSet.add((int)(Math.random()*1000));
       }
       
       //System.out.println(apnaSet.size());

       Iterator<Integer> values = apnaSet.iterator();

    //    while(values.hasNext()){
    //     System.out.println(values.next());
    //    }

       //System.out.println(apnaSet);

    //    for(int n : apnaSet){
    //     System.out.println(n);
    //    }

       Map<String,Integer> m = new HashMap<>();

       m.put("Raja",500);
       m.put("Sagar",5000);
       m.put("Pratham",5000);
       m.put("Satyanshu",5000);



       System.out.println(m.get("Raja"));

       System.out.println(m.keySet());

       Set<String> ss = new HashSet<>(m.keySet());

       System.out.println(ss);

       for(String key : ss){
        System.out.println(key + " : " + m.get(key));
       }

    }
}