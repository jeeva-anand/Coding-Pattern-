public class Maximum_Average_Subarray_1_E_643 {
    
    public double findMaxAverage(int[] arr, int k) {

        double avg = Double.NEGATIVE_INFINITY;
        int startIdx = 0;
        int sum = 0;
        
        for (int idx = 0; idx < arr.length; idx++) {
            
            sum += arr[idx];
            if (idx >= k - 1) {
                avg = Math.max(avg,sum/ (double) k);
				sum -= arr[startIdx++];
            }
        }
		return avg;
    }
    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(new Maximum_Average_Subarray_1_E_643().findMaxAverage(arr, k));
    }
}
