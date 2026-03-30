

public class InsertionSort{
    public static void main(String args[]){

        int nums[] = new int[10];
        int size = nums.length;
       
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*100);
        }

        System.out.println("Before Sorting : ");
        for(int n : nums){
           System.out.print(n + " ");
        }

        System.out.println();

        //insertion sort code

        for(int i = 1 ; i<size; i++){
            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = key;
        }
        

        
         System.out.println("After Sorting : ");
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}