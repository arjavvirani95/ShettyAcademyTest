package javaPractice;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Arjav");
		
		str.append(" Virani!");
		
		System.out.println(str);
		
		StringBuilder str1 = new StringBuilder("Riddhi"); 
		
		str1.append(" Virani!");
		System.out.println(str1);
	}
}
