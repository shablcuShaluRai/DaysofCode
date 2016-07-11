import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


		
       
public class Datatypesstr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int num;
        double dubnum;
        String line,s2;
              
              
            /* Read and save an integer, double, and String to your variables.*/

       num=scan.nextInt();
      dubnum=scan.nextDouble();
      line=scan.nextLine();
      s2=scan.nextLine();

            /* Print the sum of both integer variables on a new line. */
    System.out.println(i+num);

            /* Print the sum of the double variables on a new line. */
    System.out.println(d+dubnum);
    		
            /* Concatenate and print the String variables on a new line; 
            	the 's' variable above should be printed first. */


    System.out.println(s.concat(s2));

	}

}
