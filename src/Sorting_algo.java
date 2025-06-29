import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorting_algo {
    public static void main(String[] args) {
        int[] arr = new int[100000];  // Create array of size 500
        Random rand = new Random();

        // Fill array with random numbers between 0 and 999
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);  // any range you want
        }
        long startTime = System.nanoTime();
        insertion(arr);
       // System.out.println(Arrays.toString(arr));
        long endTime = System.nanoTime();
        double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Time taken: " + durationInSeconds + " seconds");

    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int min = i;
                    if (arr[j] < arr[min]) {
                        min= j;
                    }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j-- ;
            }
        }
    }


}