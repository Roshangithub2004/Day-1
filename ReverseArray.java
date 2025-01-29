

public class ReverseArray {
    public static int[] reverse(int arr[]){
        int n = arr.length;
        int i=0; 
        int j =n-1;
        int newArr[] = new int[n];
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return newArr;
    }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,4,5,6};
       System.out.println(reverse(arr)); 
       for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
       }
    }
    
}
