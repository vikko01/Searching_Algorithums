public class LinearSearch {

    static boolean LinearSearchAlgorithum(int arr[], int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5,8,10,13,15};
        int target = 13;

        System.out.println(LinearSearchAlgorithum(arr, target));
    }
}
