// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

// public class Demo{
//     public static void main(String args[]) throws IOException{

//         System.out.println("Enter what you wnat: ");

//         // InputStreamReader in = new InputStreamReader(System.in);
//         // BufferedReader bf = new BufferedReader(in);

//         // int n = Integer.parseInt(bf.readLine());
//         // System.out.println(n);
//         // //System.out.println(bf.readLine());

//         // bf.close();


//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         sc.nextLine();
//         System.out.println(num);

//         System.out.println("enter the string: ");

       
//         String s = sc.nextLine();

//         System.out.println(s);
//     }
// }

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Demo{
//     public static void main(String args[]) throws IOException{

//         int i = 0;
//         int j = 400;
//         BufferedReader bf= null;

//         try{
//           InputStreamReader in = new InputStreamReader(System.in);
//           bf  = new BufferedReader(in);

//           int num = Integer.parseInt(bf.readLine());

//           int ans = j / num;
//           System.out.println(ans);
//         }
//         catch(Exception e){
//             System.out.println("something went wrong : " + e);
//         }
//         finally{
//             System.out.println("finally is used to close the connection");
//             bf.close();
//         }
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo{
    public static void main(String args[]) throws IOException{

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            int num  = Integer.parseInt(bf.readLine());

            System.out.println(num);

        }
    }
}