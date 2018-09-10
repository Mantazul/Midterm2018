package math.problems;

public class Fibonacci {
    public static int[] fibonacci(int num){
        int[] array = new int[num];
        array[0]=0;
        array[1]=1;
        for(int i=2;i<num;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

         for(int i :fibonacci(40))
             System.out.println(i);


    }
}
