
public class MaximumSubArraySum {
    public static int maxSubArray(int arr[]){
        int maxSum =Integer.MIN_VALUE;
        int curSum =0;
        int n =arr.length;

        for(int i=0; i<n; i++){
            curSum +=arr[i];

            if(curSum<0){
                curSum = 0;
            }
            maxSum =Math.max(maxSum, curSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-3,-4,2,-1,4,-2,-1,5,-4};
        System.out.println(maxSubArray(arr));
    }
}
