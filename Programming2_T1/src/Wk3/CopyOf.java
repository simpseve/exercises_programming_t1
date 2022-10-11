package Wk3;

import java.util.Arrays;

public class CopyOf {

    public static int[] copyOf(int[] array){
        int[] a = Arrays.copyOf(array,10);
        System.out.println("Copied array: " +Arrays.toString(a));
        return a;
    }



    public static int[] copyOf2(int[] array, int newLength){
        int[] a = Arrays.copyOf(array,newLength);
        System.out.println("Copied array two: " +Arrays.toString(a));
        return a;
    }

    public static void main(String[] args) {
        int[] array = {10,20,30};
        System.out.println("old array: " +Arrays.toString(array));
        copyOf(array);

        copyOf2(array,5);
    }

}
