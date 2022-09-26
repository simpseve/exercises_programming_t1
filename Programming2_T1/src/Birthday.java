import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

public class Birthday {

        private int days_in_year = 365;
        private int amount_of_tries;
        private Random random = new Random();

        private Birthday(int amount_of_trails){
            amount_of_tries = amount_of_trails;
        }
        private boolean match(int group_size) {
            //create new hashset bdays with anon primitive data type
            Set<Integer> bdays = new HashSet<>();
            //for each person in the group create a new random birthday (a day between 0 and 365)
            for (int i = 0; i < group_size; ++i) {
                bdays.add(random.nextInt(days_in_year));
            }
            //check if the date generated has already appeared, if yes then a match has happened
            return bdays.size() != group_size;
        }
        
        private void run(int group_size, int tries) {
            //set matches to 0
            int matches = 0;
            //for each try if
            for (int i = 0; i < tries; ++i) {
                //if the method match returns true then a match has been made, iterate the matches.
                if (match(group_size)) {
                    matches++;
                }
            }
            System.out.println(matches+ " out of " +tries +" times matching birthdays occurred in a group of "+ group_size+ " people");

        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many times should this experiment be carried out?");
            int amount_of_trials = scanner.nextInt();
            Birthday birthday = new Birthday(amount_of_trials);
            System.out.println("Enter group size:" );
            int group_size = scanner.nextInt();
            birthday.run(group_size, birthday.amount_of_tries);

        }
    }
