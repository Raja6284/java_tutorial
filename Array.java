

public class Array {

    public static void main(String args[]){

        // int nums[] = {1,2,3,4,5};

        // int nums[] = new int[5];

        // for(int i= 0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }

        int nums[][] = new int[3][4];


        for(int i = 0; i<3; i++){

            for(int j = 0; j<4; j++){
                nums[i][j] = (int)(Math.random()*10);
            }
           
        }


        for(int i = 0; i<3; i++){

            for(int j = 0; j<4; j++){
                System.out.print(nums[i][j]  + " ");
            }
            System.out.println();
        }

        System.out.println();

        for( int n[] : nums){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();
        int jagged[][] = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<jagged[i].length; j++){
                jagged[i][j]= (int)(Math.random()*10);
            }
        }


         for(int i = 0; i<3; i++){
            for(int j = 0; j<jagged[i].length; j++){
                
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }


    }
}