import java.util.ArrayList;

public class linearSearchRec {

    static boolean isSorted(int arr[], int idx){
        if(idx >= arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return isSorted(arr, idx+1);
        
    }

    // print index of the founded element

    static int findIndex(int arr[], int target, int idx){
        if(idx >= arr.length){
            return -1;
        }
        else if(arr[idx] == target){
            return idx;
        }
        return findIndex(arr, target, idx+1);
    }

    // linear  search

    static boolean searchRec(int arr[], int target, int idx){
        if(idx >= arr.length){
            return false;
        }

        if(arr[idx] == target){
            return true;
        }

        return searchRec(arr, target, idx+1);

    }

    // print all the indicies of founded element

    static void findAllIndex(int arr[], int target, int idx){
        if(idx >= arr.length){
            return;
        }
        if(arr[idx] == target){
            System.out.println(idx);
        }
      findAllIndex(arr, target, idx+1);
    }

    // return type is arrayList

    static ArrayList<Integer> allIndicies(int arr[], int target, int idx){
        if(idx >= arr.length){
            return new ArrayList<>();
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if(arr[idx] == target){
            ans.add(idx);
        }
       ArrayList<Integer> smallAns = allIndicies(arr, target, idx+1);
       ans.addAll(smallAns);
       return ans;

    }
    public static void main(String[] args) {
        // int arr[] = {5, 7, 9, 15, 4, 20};
        // int target = 20;

        // int arr[] = {1,2,3,2,2,5};
        // int target = 2;

        int arr[] = {1,3,4,5,7};

        // if(searchRec(arr, target, 0)){

        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        // System.out.println(findIndex(arr, target, 0));
        // findAllIndex(arr, target, 0);

        if(isSorted(arr, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // ArrayList<Integer> ans = allIndicies(arr, target, 0);
        // for(Integer i : ans){
        //     System.out.println(i);
        // }
    }
}
