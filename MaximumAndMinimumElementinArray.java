
public class MaximumAndMinimumElementinArray {
    public static int MaximumEle(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] >max){
                max = arr[i];
            }
        }

        return max;
    }

    public static int MinimumEle(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String [] args){
        int arr [] = {2,4,6,8,1,3,5,7};
        System.out.println("Maximim number is: " +MaximumEle(arr));
        System.out.println("Minimum number is: " +MinimumEle(arr));
    }
}
