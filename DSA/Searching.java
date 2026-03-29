

public class Searching{
    public static void main(String args[]){

        //int nums[] = {2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int nums[] = new int[1000];
        int target = 13;

        int result1 = linearSearch(nums,target);

        System.out.println("From linear search.");
        if(result1 == -1){
            System.out.println("Elements not found");
        }else{
            System.out.println("Elements found at indes : " + result1);
        }

        System.out.println();

        int result2 = binarySearch(nums, target);
        System.out.println("From binary search.");
        if(result2 == -1){
            System.out.println("Elements not found");
        }else{
            System.out.println("Elements found at indes : " + result2);
        }

    }

    public static int linearSearch(int nums[], int target){
        int steps = 0;

        for(int i = 0; i<nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("steps taken : " + steps);
                return i;
            }
        }

        System.out.println("steps taken : " + steps);

        return -1;
    }


    public static int binarySearch(int nums[], int target){

        int s = 0;
        int e = nums.length - 1;
        int steps = 0;

        while(s<=e){
            int mid = s + (e-s)/2;
            steps++;

            if(target == nums[mid]){
                System.out.println("steps taken : " + steps);
                return mid;
            }else if(target < nums[mid]){
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }

        System.out.println("steps taken : " + steps);

        return -1;
    }
}