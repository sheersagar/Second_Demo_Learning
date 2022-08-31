import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,6,8,4,7,5,1};

        //Buble sort
        for(int i = 0; i <arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    // Now Swapping function
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}