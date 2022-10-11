package Wk3;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {


    public Boolean checkNum(int numItems){
        if (numItems<0){
            System.out.println("Must be over 0");
            return false;
        }
        return true;
    }
    public void getDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items:" );
        int numItems = scanner.nextInt();
        checkNum(numItems);
        int[] items = new int[numItems];
        System.out.println("Enter the values of all items (seperated by a space)");
        for(int i=0; i < items.length ; i++){
            items[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(items));
    }


    public static void main(String[] args) {
        PrintArray x = new PrintArray();
        x.getDetails();

    }
}
