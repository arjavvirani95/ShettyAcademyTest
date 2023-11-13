package javaPractice;

public class testPyramid {

	public static void main(String[] args) {
	
		//   *   
		//  ***  
		// ***** 
		//*******
		//*   
		//**  
		//***
		//****
		System.out.println("This is pyramid from Arjav EST zone");
		for(int i=0; i<5; i++) //for row
		{
			for(int j=5-i; j>1; j--) // for space
			{
				System.out.print(" ");
			}
			 
			for(int j=0; j<=i; j++) // for printing *
			{
				System.out.print("* ");
			} 
			System.out.println();
		}
		
		
		

	}

}
