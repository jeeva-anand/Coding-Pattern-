

class  Minimum_Size_Subarray_Sum_M{
	
    public int minSubArrayLen(int target, int arr[]) {

		int windowSum = 0;
        int windowStart = 0;
        int minLength = Integer.MAX_VALUE;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1 );
                windowSum -= arr[windowStart++];                
            } 
        }
        return minLength != Integer.MAX_VALUE ? minLength : 0;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 2, 4, 3 };
        System.out.println(new Minimum_Size_Subarray_Sum_M().minSubArrayLen(7, arr));
        
    }
}