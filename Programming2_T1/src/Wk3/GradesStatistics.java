package Wk3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GradesStatistics {

    int[] students;
    Scanner scanner = new Scanner(System.in);

    public GradesStatistics(int n){
        this.students = new int[n];
    }


    public Boolean checkGrade(int grade){
        return grade<0 || grade >100;
    }
    public void getDetails(){

        for(int i=0; i < students.length ; i++){
            int studentNo = i + 1;
            System.out.print("Enter grade for student:" + studentNo);
            int grade = scanner.nextInt();
            if(checkGrade(grade)){
                System.out.print("Must be between 0-100");
                break;

            }else{
                students[i] = grade;
            }
        }
        System.out.println("Grades are: " + Arrays.toString(students));
    }

    public void  getAverage(){
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i];
        }
        double av = sum / students.length;
        System.out.println("The average is: "+ av);
    }
    public void getMedian(){
        //https://javatutoring.com/java-calculate-median/ - code inspo
        int m = 0;
        int n = students.length;
        if(n%2==1)
        {
            m=students[(n+1)/2-1];
        }
        else
        {
            m=(students[n/2-1]+students[n/2])/2;
        }

        System.out.println("Median value :"+ m);

    }

    public void getMin(){
        Arrays.sort(students);
        System.out.println("The minimum is: " + students[0]);
    }

    public void getMax(){
        Arrays.sort(students,0,students.length);
        int highest = students.length -1;
        System.out.println("The maximum is: " + students[highest]);
    }



    public static void main(String[] args) {
        System.out.println("Enter number of students");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        GradesStatistics x = new GradesStatistics(n);
        x.getDetails();
        x.getAverage();
        x.getMedian();
        x.getMin();
        x.getMax();
    }
}
