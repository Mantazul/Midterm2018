package math.problems;

import java.util.Iterator;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    public static int fact(int num){

        if(num==1) return num;
        else num = num * fact(num-1);


        return num;
    }
    public static int iterateFactorial(int num){
        int factorial = 1;
        for(int i=1;i<num;i++)
            factorial = factorial * (i+1);
        return factorial;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Finding factorial using recursion: ");
        System.out.println(fact(5));
        System.out.println("Finding factorial using iteration: ");
        System.out.println(iterateFactorial(5));

    }
}
