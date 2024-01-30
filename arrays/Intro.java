package arrays;

/**
 * intro
 */
public class Intro {
    public static void main(String[] args) {
            // arrays syntax 
    // datatype[] variable_name =  new datatype[size];
    // store 5 roll number
    // int[] rnos =  new int[5];
    // or directly
    // int[] rnos2 =  {23,24,53,2772,839};


    int[] rnos; 
    // declaration of array. ros is getting declared in the stack
    // compile time
    rnos = new int[5]; // actually here object is being created in the memory (heap)
    // runtime 
    System.out.println(rnos);

    System.out.println(rnos[0]);

        
    }



    
}