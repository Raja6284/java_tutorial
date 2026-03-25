
public class Demo{
    public static void main(String args[]){

        int i = 0;
        int j = 12;

        int ans = 0;

        int nums[] = new int[5];
        String str = null;

        try{
            //ans = j/i;
            System.out.println(nums[1]);
            //System.out.println(nums[5]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }

        System.out.println(ans);
        System.out.println("hello g");
    }
}