package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */

		int num = 51;
		int round = 5;
		int pattern =1;
		while (num >= 1) {
           for(int i=0;i<(round * pattern) ; i++){
			   num = num - pattern;
			   if(num<1) break;
			   System.out.println(num);
		   }
		   pattern++;
		}
	}
}

/**
 * difference adds 1 every pattern. after round of 10 , range multiplies to multiples of 10 each round.
 * multiples of 10 from that number itself.
 */
