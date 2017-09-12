package assignment2_2;

/**
 * This class will print the below pattern using loops 
 *	    a 
 *	  a b a 
 *	a b c b a 
 *	  a b a 
 *	    a 
 */
public class Assignment2_2 {
	
	public static void main( String arg[])
	{ // main method starts
		int charA='a', lines=5; 								// Initializing the pattern Character a and odd number of lines as variables for pattern
		int patternSplit1=(lines/2)+1,patternSplit2=lines/2;	// Split the lines and Assign to variables
		
		//Printing upper split of the pattern
		for (int i=1; i<=patternSplit1; i++) {
			for (int j=1; j<=patternSplit1-i; j++) { 	
				System.out.print("  ");					// Print spaces at start of each row
			}
			for (int j=1; j<=i; j++) {					
				System.out.print((char)(j-1+charA)+" ");// Print increasing character till center split
			}
			for (int j=i-1; j>=1 ; j--) {				
				System.out.print((char)(j-1+charA)+" ");// Print decreasing character after center split 
			}
			System.out.println();						// Print new line after each iteration
			
		}
		
		//Printing lower split of the pattern
		for (int i=1; i <= patternSplit2; i++) {
			for (int j=1; j<=i; j++) { 					
				System.out.print("  ");					// Print spaces  at start of each row
			}
			for (int j=1; j<=patternSplit1-i; j++) {	
				System.out.print((char)(j-1+charA)+" ");// Print increasing character till center split
			}
			for (int j=patternSplit2-i; j>=1 ; j--) {	
				System.out.print((char)(j-1+charA)+" ");// Print decreasing character after center split 
			}
			System.out.println();						// Print new line after each iteration
		}
			
	}
}// Class closed