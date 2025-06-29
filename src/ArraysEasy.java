import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class ArraysEasy {
    public static void main(String[] args) {

        longestSubarray();
       //System.out.print(max);

    }
    static int slargest(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers (-1 for exit):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }
        int lar=Integer.MIN_VALUE;
        int slar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>lar){
                slar=lar;
                lar= arr.get(i);
            }
            else if(arr.get(i)<lar && arr.get(i)>slar){
                slar=arr.get(i);
            }
        }
        return slar;



    }
    static int max() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers (-1 for exit):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }
        int maxele = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxele) {
                maxele = arr.get(i);
            }
        }
        return maxele;
    }
    static boolean checksort(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers (-1 for exit):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }
            for (int i = 0; i < arr.size() - 1; i++) {
                if(arr.get(i)<=arr.get(i+1)){

                } else{
                    return false;
                }
            }
            return true;

    }
    static int removeduplicate(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers (-1 for exit):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }
        int i=0;
        for (int j = 1; j < arr.size(); j++) {
            if(!arr.get(i).equals(arr.get(j))){
                arr.set(i+1,arr.get(j));
                i++;
            }

        }
        System.out.println(arr);
        return i+1;

    }
    static int maxones(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers (-1 for exit):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }

        int cunt=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() ; i++) {
            if(arr.get(i)==1){
                cunt+=1;
            }
            else{
                max=Math.max(cunt,max);
                cunt=0;
            }
        }
        max=Math.max(cunt,max);
    return max;
    }
    public static void  longestSubarray() {
        int[] nums = {1,2,3,1,1,1,1,6};
        int k=6;
            HashMap<Integer,Integer> dk = new HashMap<>();
            int len=0;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];

                if(sum==k){
                    len=Math.max(len,i+1);
                }
                int rem = sum-k;
                if(dk.containsKey(rem)){
                    int size=i-dk.get(rem);
                    len=Math.max(size,len);
                }
                if(!dk.containsKey(sum)){
                    dk.put(sum,i);
                }

            }
        System.out.println(len);

        }

}
