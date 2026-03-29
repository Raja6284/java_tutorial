

public class SelectionSort{
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

        //selection sort code

        for(int i = 0; i<size-1; i++){
            int minIndex = i;
            for(int j = i+1; j<size; j++){
                if(nums[minIndex] > nums[j]){ //finding the index of minimum element
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        

        
         System.out.println("After Sorting : ");
        for(int n : nums){
            System.out.print(n + " ");
        }
    
    }
}