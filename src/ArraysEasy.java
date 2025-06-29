import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArraysEasy {
    public static void main(String[] args) {

       System.out.print(maxones());
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

}
