package javaPractice;

public class EncapExample {

	//Declared private variable 
	private String empName;
	//Declared private methods
	private void modifyEmpName(String newName) {
		empName = newName + "";
	}

	//Generate getter and setter methods
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String newName) {
		modifyEmpName(newName);
	}

	public static void main(String[] args) {

		//creating object of class
		EncapExample enob = new EncapExample();
		//using object pass new name
		enob.setEmpName("arjav");
		//using object getting and printing name
		System.out.println(enob.getEmpName()); 

	}

}
