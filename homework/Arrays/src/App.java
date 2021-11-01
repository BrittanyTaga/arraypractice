
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        /*Summing up values of a given array in java */
        
       int[] first = {2, 4, 5};
       int[] second = {3, 5, 6};
       int[] result = add(first, second);
       System.out.println(Arrays.toString(result));



        
        // double[ ] exampleArray = {1,5,6,5,4,1};

        // double maximum = exampleArray[0];

        // int index = 0;

        // for (int i = 1; i<exampleArray.length; i++){

        //      if (exampleArray[ i ] > maximum) {

        //           maximum = exampleArray[ i ];

        //           index = i;

        //      }

        // }

        // System.out.println(index);

        //output is 2
        
        /*Write a public staic mthod called toPower that takes in
        two integers called size and power. method should return an array
        of size with each array index raised to power */


    }

    private static int[] add(int[] first, int[] second) {
        int length = first.length < second.length ? first.length
        : second.length;
    int[] result = new int[length];

        for (int i = 0; i < length; i++) {
    result[i] = first[i] + second[i];
    }

    return result;
    
    }

    /*To the power*/
    // public class ProductOfArrayOfElements {
    //     public static void main(String args[]){
    //        System.out.println("Enter the required size of the array :: ");
    //        int size = s.nextInt();
    //        int myArray[] = new int [size];
    //        int product = 1;
    //        for(int i=0; i<size; i++){
    //           myArray[i] = s.nextInt();
    //           product = myArray[i] * myArray[i];
    //        }
    //        System.out.println("Elements of the array are: "+Arrays.toString(myArray));
    //        System.out.println("Sum of the elements of the array ::"+product);
       // }
    //}
}

    

