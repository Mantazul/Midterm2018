package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         int[] array = new int[40];
         array[0]=0;
         array[1]=1;
         for(int i=2;i<40;i++){
             array[i] = array[i-1] + array[i-2];
             System.out.println(array[i]);
         }


    }
}
