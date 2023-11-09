package methodOverRidingExample;

public class demoDraw {

	public static void main(String[] args) {
		
		//reference of shape class and object of square class
		shapeBaseClass r = new squareDerivedClass();
		//it will call object class method by referring reference class because we did override in base class
		r.draw();

	}

}
