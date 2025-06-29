import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Merge_sort {
        public static void merge(int[] arr, int low, int mid, int high) {
            int left = low;
            int right = mid + 1;
            ArrayList<Integer> temp = new ArrayList<>();

            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    temp.add(arr[left]);
                    left++;
                } else {
                    temp.add(arr[right]);
                    right++;
                }
            }

            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }

            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }


            for (int i = low; i <= high; i++) {
                arr[i] = temp.get(i - low);
            }
        }
        public static void main(String[] args) {
            int[] arr = new int[10];
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(10000);  // any range you want
            }
            long startTime = System.nanoTime();
            mergeSort(arr, 0, arr.length - 1);
            long endTime = System.nanoTime();
            double durationInSeconds = (endTime - startTime) / 1_000_000_000.0;
            System.out.println("Time taken: " + durationInSeconds + " seconds");




        }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr,mid + 1, high);
        merge(arr, low, mid, high);
    }
    }


