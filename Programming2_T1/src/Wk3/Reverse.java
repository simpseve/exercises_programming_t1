package Wk3;

import java.util.Arrays;

public class Reverse {

    public static void reverse(int[] array)
    {
        for (int i = 0, a = array.length - 1; i < a; ++i, --a) {
            int tmp = array[i];
            array[i] = array[a];
            array[a] = tmp;

        }
        System.out.println("Reversed array is: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array= {10,20,30,40};
        reverse(array);
    }


}
