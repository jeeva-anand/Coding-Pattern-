public class Maximum_Size_Subarray_Palindrome {

    private static int maximumSizeSubarrayPalindromeOptimization(int[] arr) {
        // Optimization is Sliding Window, here the window is variable size: T(n) = O()

        int maxSize = 1;
        
        for (int windowStart = 0, windowend = 0; windowend < arr.length; windowend++) {
            
        }

        return 0;
    }

    private static int maximumSizeSubarrayPalindromeBruteForce(int[] arr) {
        // Optimization is Sliding Window, here the window is variable size: T(n) = O()

        int maxSize = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (ifPalindrome(arr, i, j)) {
                    maxSize = Math.max(maxSize, j - i + 1);
                }
            }
        }

        return maxSize;
    }

    private static boolean ifPalindrome(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        while (start < end) {
            if (arr[start++] != arr[end--])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 50, 20, 30, 50, 10 };
        int totalCount = maximumSizeSubarrayPalindromeBruteForce(arr);
        System.out.println("TotalCount: " + totalCount);
    }
}
