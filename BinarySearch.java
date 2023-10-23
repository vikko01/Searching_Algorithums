public class BinarySearch {

    static boolean BinarySearchAlgorithum(int arr[], int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return true;
            }
            else if (arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        int target = 0;
        while(target != 10){
        System.out.println(" target exits in " + target + " " + BinarySearchAlgorithum(arr, target));
        target++;
        }
    }
}
