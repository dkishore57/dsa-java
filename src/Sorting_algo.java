import java.util.Arrays;
import java.util.Scanner;

public class Sorting_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no elements:");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("Before sorting:");
        System.out.println(Arrays.toString(num));
        System.out.print("After sorting: ");
        bubble(num);
        System.out.println(Arrays.toString(num));

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
}