package studio3;
import java.util.Scanner;

public class Sieve {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the n numbers you want to sift:");
		boolean [] nNumbers = new boolean[in.nextInt()];
		
		nNumbers[0] = true;
		for(int i = 1; i< (int) Math.sqrt(nNumbers.length); i++) {
			for (int j = (int)Math.pow(i+1,2); j<nNumbers.length + 1 ; j= j + (i+1)) {
				nNumbers[j-1] = true;
			}
		}
		for (int k = 0; k < nNumbers.length; k++) {
			if (nNumbers[k] == false)
			{
				System.out.println(k+1);
			}
		}
	}

}
