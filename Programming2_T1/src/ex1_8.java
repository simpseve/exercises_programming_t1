public class ex1_8 {

    // Question 1- check if multiple
    public Boolean isMultiple(Long n, Long m) {
        if( m%n == 0){
            System.out.println("is multiple");
            return true;
        }
        else{
            System.out.println("Isn't multiple");
            return false;
        }
    }

    // Question 2 check if Odd
    public Boolean isOdd(int i){
        if(((i & 1) == 0)){
            System.out.println("Is Even");
            return false;
        }
        else{
            System.out.println("Is Odd");
            return true;
        }

    }


}

