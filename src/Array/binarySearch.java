package Array;

class Solution {
    public boolean binarySearch(int[] arr, int k) {
        return binary(arr, 0, arr.length - 1, k);
    }

    public boolean binary(int[] arr, int left, int right, int target) {

        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return true;
        }

        else if (arr[mid] < target) {
            return binary(arr, mid + 1, right, target);
        }

        else {
            return binary(arr, left, mid - 1, target);
        }
    }
}
