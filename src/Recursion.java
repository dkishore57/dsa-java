import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        int[] arr = {3,6};
        List<List<Integer>> ans = combination_sum( arr,90);
        System.out.println(ans);
    }
    public static void find_combination(int ind,int target,List<List<Integer>> ans,List<Integer> ds, int[] arr){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            find_combination(ind,target-arr[ind],ans,ds,arr);
            ds.removeLast();
        }
        find_combination(ind+1,target,ans,ds,arr);


    }
    public static List<List<Integer>> combination_sum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        find_combination(0,target,ans,new ArrayList<>(),arr);
        return ans;


    }
}
