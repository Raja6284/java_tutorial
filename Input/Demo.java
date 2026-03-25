import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo{
    public static void main(String args[]) throws IOException{

        System.out.println("Enter what you wnat: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int n = Integer.parseInt(bf.readLine());
        System.out.println(n);
        //System.out.println(bf.readLine());

        bf.close();
    }
}