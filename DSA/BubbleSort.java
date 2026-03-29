

public class BubbleSort{
    public static void main(String args[]){

        int nums[] = new int[10];
        int size = nums.length;
        int temp = 0;
        int steps = 0;

        for(int i = 0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*100);
        }

        System.out.println("Before Sorting : ");
        for(int n : nums){
           System.out.print(n + " ");
        }

        System.out.println();


        //BubbleSort algo
        for(int i = 0; i<size; i++){
            for(int j = 0; j<size-i-1; j++){
                steps++;
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("steps taken : " + steps);
         System.out.println("After Sorting : ");
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}