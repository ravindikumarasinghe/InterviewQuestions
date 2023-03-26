package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // define an array
        int a[] = {7, 5, 3, 2, 8};

        // print array in String format
        // use .toString() method
        System.out.println("Array before sorting: " + Arrays.toString(a));


        // get count of elements in array
        //use length function

        int n = a.length;

        // Bubble Sort
        // run (n-1) number of times to sort completely
        // need 2 loops (nested loop)

        for(int i =0; i<n-1; i++)       // Number of passes
        {
            for(int j=0; j<n-1; j++)      // Iteration in each pass
            {
                // create temporay variable to store a[j] element
                // swap numbers
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;

            }
        }

        System.out.println("Array after sorting: " +Arrays.toString(a));
    }
}
