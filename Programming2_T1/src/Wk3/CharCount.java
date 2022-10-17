package Wk3;

public class CharCount {

    public static void main(String[] args) {
        //256 characters
        int[] charCounts = new int[256];

        String hello = "Hello";

        for(int i=0;i<hello.length();i++){
            charCounts[hello.charAt(i)] ++;
        }
        //fill the array with characters (cast the counter to be char type- will parse through characters instead of integers)
        for(int i=0;i<charCounts.length;i++){
//            System.out.println((char)i + ": " + charCounts[i]);
            if(charCounts[i] > 0){
                System.out.println((char)i +" :" + charCounts[i]);
            }
        }

    }

}
