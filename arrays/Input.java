package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // take input in arr

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i =0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for (int i : arr) { // for each loop
            System.out.print(i+" "); // here i represent the element of array
        }
        System.out.println();


        // another method  of printing 
        System.out.println(Arrays.toString(arr));
        
        
        
    }
    
}
