package Wk3;

import java.util.Arrays;

public class Swap {
    public static boolean swap(int[] array1, int[] array2){

        for (int i = 0; i < array1.length; ++i) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;

        }
//        System.out.println("Reversed array is: " + Arrays.toString(array));
//    }
        System.out.println("Swapped Array 1: " +Arrays.toString(array1));
        System.out.println("Swapped Array 2: " +Arrays.toString(array2));
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4}; //left
        int [] array2 = {5,6,7,8}; //right
        System.out.println("Array 1: " +Arrays.toString(array1));
        System.out.println("Array 2: " +Arrays.toString(array2));
        swap(array1,array2);
    }
}
