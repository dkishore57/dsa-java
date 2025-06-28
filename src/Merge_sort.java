import java.util.ArrayList;

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
            int[] arr = {5, 2, 4, 1, 3, 100 , 100 , 109 , 108, 10  };

            mergeSort(arr, 0, arr.length - 1);
            for (int num : arr) {
                System.out.print(num + " ");
            }
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


