package Sorting;

// Problem Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class MedianOfTwoSorted {
    public static void main(String[] args) {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};

        double ans = findMedianSortedArrays(num1, num2);
        System.out.println(ans);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the two array in one
        int[] nums = merged(nums1, nums2);

        int N = nums.length;

        // Check if the number is even or odd
        int evenOdd = N & 1;

        // Get the half-length
        int halfLength = N / 2;

        if (evenOdd == 0){
            // It is an even number so have two median number
            return (nums[halfLength - 1] + nums[halfLength]) / 2.0;
        }

        return nums[halfLength];
    }

    public static int[] merged(int[] nums1, int[] nums2){
        // Length of the array
        int N1 = nums1.length;
        int N2 = nums2.length;

        int N = N1 + N2;

        int[] nums = new int[N];
        // Set i, j, k pointers for nums1, nums2, nums array respectively
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < N1 && j < N2) {
            if (nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else {
                nums[k++] = nums2[j++];
            }
        }

        while (i < N1){
            nums[k++] = nums1[i++];
        }

        while (j < N2){
            nums[k++] = nums2[j++];
        }

        return nums;
    }
}
