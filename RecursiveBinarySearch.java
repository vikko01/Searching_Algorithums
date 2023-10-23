public class RecursiveBinarySearch {

    static boolean BinarySearchAlgorithum(int arr[], int low, int high, int target){
        int n = arr.length;
       
        int mid = (low + high)/2;
        if(low > high){
            return false;
        }
        else if (arr[mid] == target){
            return true;
        }
        else if (arr[mid] > target){
            return BinarySearchAlgorithum(arr, low, mid-1, target);
        }
        else{
            return BinarySearchAlgorithum(arr, mid+1, high, target);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,8,10,13,15};
        int target = 16;

        System.out.println(BinarySearchAlgorithum(arr, 0, arr.length-1, target));
    }
}
