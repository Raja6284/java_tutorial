
class RajaException extends Exception{

    public RajaException(String string){
        super(string);
    }
}

public class Demo{
    public static void main(String args[]){

        int i = 12;
        int j = 0;

        int ans = 0;

        int nums[] = new int[5];
        String str = null;

        try{
            ans = j/i;

            if(ans == 0){
                //throw new ArithmeticException("this is the default messgae");
                throw new RajaException("this is a custom exception message");
            }
                    
            //System.out.println(nums[1]);
            //System.out.println(nums[5]);
            //System.out.println(str.length());
        }
        catch(RajaException e){
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