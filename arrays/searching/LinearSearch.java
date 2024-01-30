package arrays.searching;

public class LinearSearch {

    static int linearSearch(int[] arr, int x){
        for (int i =0;i<arr.length; i++) {
            if(x==arr[i]){
                return  i ;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int [] arr = {1, 24,33,12,32};
        int x  = 24;
        System.out.println(linearSearch(arr, x));

        


        
    }
    
}
