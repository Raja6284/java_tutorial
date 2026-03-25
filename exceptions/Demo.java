
public class Demo{
    public static void main(String args[]){

        int i = 0;
        int j = 12;

        int ans = 0;

        try{
            ans = j/i;
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(ans);
        System.out.println("hello g");
    }
}