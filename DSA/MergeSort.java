

public class MergeSort{
    public static void main(String args[]){
         int nums[] = new int[11];

        int size = nums.length;

        for(int i = 0; i<size; i++){
            nums[i] = (int)(Math.random()*100);
        }

        System.out.println("Befor sorting : ");
        for(int i = 0; i<size; i++){
            System.out.print(nums[i] + " ");
        }


       //merge sort code
       //will be implemented later

        System.out.println();

        System.out.println("After sorting : ");
        for(int i = 0; i<size; i++){
            System.out.print(nums[i] + " ");
        }
    }
}