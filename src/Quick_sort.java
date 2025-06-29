import java.util.Arrays;
import java.util.Random;

public class Quick_sort {

    static void swap(int[] arr ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];  // Create array of size 500
        Random rand = new Random();

        // Fill array with random numbers between 0 and 999
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);  // any range you want
        }
        long startTime = System.nanoTime();
        quicksort(arr,0, arr.length-1);
      //  System.out.println(Arrays.toString(arr));
        long endTime = System.nanoTime();
        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Time taken: " + durationInSeconds + " seconds");


    }
    static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pindex=quick(arr,low,high);
            quicksort(arr,low,pindex-1);
            quicksort(arr,pindex+1, high);
        }
    }
    static int quick(int[] arr, int low, int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }


        }
        swap(arr,j,low);
        return j;

    }
}
