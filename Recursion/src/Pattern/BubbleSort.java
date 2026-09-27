package Pattern;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = { 4 , 5, 6 , 2 , 4, 1 , 0 , 9};
        sort(arr , arr.length - 1, 0 );
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr , int r , int c){
         if(r == 0) {
                return;
            }
         if(c < r){
            if(arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[r];
                arr[r] = temp;
            }
            sort(arr , r , c + 1);
            }else{
                sort(arr , r - 1, 0);
            }
        }
}
