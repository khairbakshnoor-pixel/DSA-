public class search {

    public int binaryiterative(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    static int recursivebinarysearch(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return recursivebinarysearch(arr, low, mid - 1, key);
        } else {
            return recursivebinarysearch(arr, mid + 1, high, key);
        }
    }
}
