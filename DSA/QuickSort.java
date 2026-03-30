
public class QuickSort{

    public static int partition(int arr[],int low, int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp; 

        return i+1;

    }

    public static void quickSort(int arr[], int low, int high){

        

        if(low < high){

            int pi = partition(arr,low,high);

            quickSort(arr, low,pi-1 );
            quickSort(arr, pi+1 , high);
        }
    }

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


        //quick sort calling
        quickSort(nums,0,size-1);

        System.out.println();

        System.out.println("After sorting : ");
        for(int i = 0; i<size; i++){
            System.out.print(nums[i] + " ");
        }
    }
}